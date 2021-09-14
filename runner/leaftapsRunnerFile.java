package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import leafTapsApplication.LeafApplicationBaseClass;
import leafTapsApplication.LeafApplicationHooksImplementation;


@CucumberOptions(features="src/test/java/features",
				  glue="leafTapsApplication", monochrome=true, publish=true)
				  //tags="@functional_testcase or  @smoke")
public class leaftapsRunnerFile extends LeafApplicationBaseClass{

}
