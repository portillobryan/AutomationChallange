package com.co.web.runners;

import com.co.web.utils.excel.BeforeSuite;
import com.co.web.utils.excel.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/user_register.feature",
        glue = {"com.co.web.stepdefinitions", "com.co.web.hooks"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class RegisterRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/user_register.feature");
    }
}
