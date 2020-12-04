package assignment3;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//features",
        glue="assignment3",
        plugin=
        { "pretty", "html:target/cucumber-reports3" },
        monochrome = true
        )

public class TestRunner3 {

}
