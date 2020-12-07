package assignment8;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//feature3",
        glue="assignment8",
        plugin=
        { "pretty", "html:target/cucumber-reports8" },
        monochrome = true
        )

public class TestRunner8 {

}
