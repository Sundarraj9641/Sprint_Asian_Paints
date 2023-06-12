package com.testrunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		plugin = {"pretty","json:target/Cucumber.json",                           
		           "junit:target/Cucumber.xml",
		            "html:target/Cucumber.html",
		                "html:test-output"},
		features = "C:\\Users\\SBARURE\\eclipse-workspace\\group_2_shradha\\Feature_Asianpaint",
		glue={"Step_defination"},
		
 	    tags = {"@Find_Contractor_page_navigation"}
		)
public class Shardha_step_runner {

}

