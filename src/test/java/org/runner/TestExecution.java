package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\login.feature",snippets=SnippetType.CAMELCASE,strict=true,tags="@smoke")

public class TestExecution {

}
