package runner;


import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;



@CucumberOptions(features="src/test/java/features/Login.feature",
				  glue="steps1",  monochrome=true,  publish=true)
				  //tags="@functional_testcase or  @smoke")
public class CucumberRunner extends BaseClass{

}
