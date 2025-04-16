package com.tanos.project.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/banistmo-abrir-pdf.feature",
        glue = "com.tanos.project.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class BanistmoRunner {
}
