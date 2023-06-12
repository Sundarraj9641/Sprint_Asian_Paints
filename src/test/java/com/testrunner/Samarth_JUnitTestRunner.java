package com.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		features = "C:\\Users\\SAMBHOSA\\Downloads\\Asian_Paints_anjith_6th_april_batch\\Asian_Paints\\features\\paint_Selector.feature",
		glue = "com.asianpaints.colors.stepDefinition",
		plugin = { "pretty",
				"json:resources/Cucumber.json",
				"junit:resources/Cucumber.xml",
		"html:resources/Cucumber.html" }
//		tags = {"@Find_Contractor",}
		)



public class Samarth_JUnitTestRunner
{
	

}
