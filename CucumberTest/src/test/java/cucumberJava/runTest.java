package cucumberJava;
 
import org.junit.runner.RunWith; 
//import cucumber.junit.Cucumber; 
//In TestRunner.java
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class) 
@CucumberOptions(features = "classpath:cucumberJava/cucumberJava.feature")

//@CucumberOptions(format = {"pretty", "html:target/cucumber"}) 
public class runTest { }