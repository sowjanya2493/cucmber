package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\seleniumNEW\\BDD\\src\\main\\java\\features\\dealsmaps.feature",
                           glue={"stepdefinitions"},
                           format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
                           monochrome=true,//it will generate the console in a readable format
                           dryRun=false,
                           strict=true
                           )
public class Testrunner {

}
