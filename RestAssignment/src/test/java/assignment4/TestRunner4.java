package assignment4;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//features",
        glue="assignment4",
        plugin=
        { "pretty", "html:target/cucumber-reports4" },
        monochrome = true
        )

public class TestRunner4 {

}
