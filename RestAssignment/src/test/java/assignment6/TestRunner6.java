package assignment6;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//features2",
        glue="assignment6",
        plugin=
        { "pretty", "html:target/cucumber-reports6" },
        monochrome = true
        )

public class TestRunner6 {

}
