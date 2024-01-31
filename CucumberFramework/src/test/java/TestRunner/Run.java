package TestRunner;
//package TestRunner;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = ".//Feature/LoginDemo.feature",
//		glue= "StepDefination",
//		dryRun = true,
//		monochrome = true,
//		plugin = {"io.cucumber.plugin.Pretty"}
//
//		)
 
//public class Run {
////Class will be empty
//}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   //features = ".//Feature/LoginFeature.feature",
    
    		//features = ".//CucumberFramework/Features/LoginDemo.feature",
	    features = "C:\\Users\\Administrator\\eclipse-workspace\\CucumberFramework\\Features\\LoginDemo.feature",
    glue = "StepsDefintion",
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports/reports1.html"}
	    
	 
)
public class Run {
}
