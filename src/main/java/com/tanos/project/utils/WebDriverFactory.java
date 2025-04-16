package com.tanos.project.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverFactory {

        private WebDriverFactory() {
        }

        public static WebDriver goToWeb(String url) {
            WebDriver driver = getDriver();
            driver.get(url);
            driver.manage().window().maximize();
            return driver;
        }

        private static WebDriver getChromeDriver() {

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(
                    "--incognito",
                    "--disable-infobars",
                    "enable-automation",
                    "--remote-allow-origins=*",
                    "ignore-certificate-errors",
                    "--disable-browser-side-navigation");

            return WebDriverManager.chromedriver().capabilities(chromeOptions).create();
            // si su Chrome tiene la ultima version se recomienda colocar aqui la carpeta con el numero de la version y dentro el chrodriver con la version de su chrome
            //return WebDriverManager.chromedriver().driverVersion("116.0.5845.96").capabilities(chromeOptions).create();
        }

        private static WebDriver getDriver() {
            return (ReadFiles.DEFAULT_BROWSER.equals(ReadFiles.CHROME)) ? getChromeDriver() : getEdgeDriver();
        }

        private static WebDriver getEdgeDriver() {

            EdgeOptions options = new EdgeOptions();
            options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            options.addArguments("--remote-allow-origins=*");
            return WebDriverManager.edgedriver().capabilities(options).create();

        }
    }

