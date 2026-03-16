package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features/add_remove_elements.feature",
    glue = "steps",
    monochrome = true,
    publish = true,
    plugin = {
        "pretty",
        "junit:target/JUnitReports/add_remove_elements_report.xml",
        "json:target/JSonReports/add_remove_elements_report.json",
        "html:target/HtmlReports/add_remove_elements_report.html"
    }
)
public class AddRemoveElementsRunner {
}