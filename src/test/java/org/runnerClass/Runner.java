package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\USER\\eclipse-workspace\\NewMavenProject"
		+ "\\featurefiles\\newfeature.feature",
		glue= "org.stepDefinitions",dryRun=true)

public class Runner {

	
}
