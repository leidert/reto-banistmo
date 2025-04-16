package com.tanos.project.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUi {

    public static final Target BUTTON_COOKIES = Target.the("click in the button cookies")
            .located(By.id("btn-aceptar-cookies"));

    public static final Target BUTTON_APRENDER = Target.the("click in the button APRENDER")
            .located(By.linkText("Aprender es fácil"));

   public static final Target BUTTON_LEGALES = Target.the("click in the button legales")
            .located(By.xpath("(//img[@alt='Ícono'])[5]"));

   public static final Target BUTTON_FATCA = Target.the("click in the button fatca")
            .located(By.xpath("(//img[@alt='Ícono'])[2]"));

   public static final Target BUTTON_DOWNLOAD = Target.the("click in the button download")
            .located(By.xpath("(//*[@alt = 'Descargar PDF'])[3]"));
}
