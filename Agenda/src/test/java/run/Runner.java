package run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/CadastroContato.feature", 
		glue = { "steps" },
		tags = {"@dup"},
		monochrome = true,
		plugin = {"pretty", "junit:target/JUnitReports/report.xml",
				"json:target/JSONReports/report.json",
				"html:target/HtmlReports"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false, 
		strict = false)

public class Runner {

}