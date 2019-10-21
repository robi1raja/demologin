package com.d.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="CucumberFiles",
		glue="com.d.mystepdef",
		dryRun=false  ,
		
		 plugin = { "pretty",
"html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true


		
		
		
		
		
		
		
		)





public class Testrunner extends AbstractTestNGCucumberTests {

}
