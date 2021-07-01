package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\96655\\git\\project2\\projects\\projectTwo.feature" }
				,glue = {"seleniumTest" }
				,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
				,monochrome = true)

public class runner
{

}
