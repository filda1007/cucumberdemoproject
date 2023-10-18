package Runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/cucumberdemoproject/src/test/java/feature/fblogin.feature",
glue="StepDefinitions",tags="@RegressionTest")

public class login {

}
