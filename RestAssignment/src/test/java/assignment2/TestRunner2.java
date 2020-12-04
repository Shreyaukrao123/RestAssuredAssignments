package assignment2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//features",
        glue="assignment2",
        plugin=
        { "pretty", "html:target/cucumber-reports2" },
        monochrome = true
		)
public class TestRunner2 {

}
