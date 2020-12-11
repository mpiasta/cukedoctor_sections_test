
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = false,
        features = "src/test/resources/features",
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm", "pretty", "json:target/cucumber.json","junit:target/cucumber.xml"},
        glue = "classpath:com.mobileqa/steps",
        tags = "not @old"
        )
public class TestRunner {
}
