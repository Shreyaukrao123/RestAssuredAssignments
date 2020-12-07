package assignment7;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//resources//features2",
        glue="assignment7",
        plugin=
        { "pretty", "html:target/cucumber-reports7" },
        monochrome = true
        )
public class TestRunner7 {

}
