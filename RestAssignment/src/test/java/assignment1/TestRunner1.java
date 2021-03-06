package assignment1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//features",
        glue="assignment1",
        plugin=
        { "pretty", "html:target/cucumber-reports1" },
        monochrome = true
        )
public class TestRunner1 {

}
