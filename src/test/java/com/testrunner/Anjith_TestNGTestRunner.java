package com.testrunner;
package com.asianpaints.coloursandtextures.testRunner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;




@CucumberOptions(
		
		features = "features",
		glue = "com.asianpaints.coloursandtextures.stepDefinitions",
		plugin = { "pretty",
				"json:resources/Cucumber.json",
				"junit:resources/Cucumber.xml",
		"html:resources/Cucumber.html" },
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		monochrome = true,
		tags = {"@Find_Contractor or @PaintBudgetCalaculator"}
		)


public class  TestNGTestRunner AbstractTestNGCucumberTests {

	 @DataProvider(parallel = true)

	    public Object[][] scenarios() {
	        return super.scenarios();
	    }

	    @AfterSuite
	    public void teardown() {
	        SetupDriver.teardown();
	    }
	
}

