package cl.falabella.publicsite.automation.stageSet;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cl/falabella/publicsite/automation/definition",
        plugin = {"pretty:target/reportes/pretty/pretty.txt",
                "html:target/reportes/html",
                "json:target/reportes/json/report.json",
                "junit:target/reportes/junit/junit.xml",
                "usage:target/reportes/usage/usage.json",
                "rerun:target/reportes/rerun/rerun.txt"}
)
public class StageSet {
}
