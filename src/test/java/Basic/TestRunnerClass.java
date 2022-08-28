package Basic;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Raveen\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feature\\Adactinlogin.feature", glue = "StepDefinitions")

public class TestRunnerClass {

}
