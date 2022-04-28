package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\login.feature" ,glue="org.stepdef1",monochrome=true,dryRun=false,
plugin= {"pretty","html:C:\\Users\\PriyaVenkatesan\\eclipse-workspace\\Login\\target",
		"json:C:\\Users\\PriyaVenkatesan\\eclipse-workspace\\Login\\target\\sample.json",
		"junit:C:\\Users\\PriyaVenkatesan\\eclipse-workspace\\Login\\target\\sample.xml"})


public class TestRunner {

}