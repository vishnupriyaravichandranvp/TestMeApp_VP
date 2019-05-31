package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefolder/example.feature",glue="Stepdefinition",
plugin="json:c:\\cucumber-html-report.json",tags={"@category,@sub-category"})

public class Runner2 {
	

}
