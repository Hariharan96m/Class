package Basic;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Raveen\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feature\\", glue = "StepDefinitions",monochrome = true)
public class TestRunnerOrange {
}
