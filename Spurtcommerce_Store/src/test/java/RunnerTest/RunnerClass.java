package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/RegistrationPage.feature", glue = { "hooks", "StepDefinations"}, monochrome = true, plugin = { "pretty",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },dryRun =!true
,snippets = SnippetType.CAMELCASE)
public class RunnerClass {

}
