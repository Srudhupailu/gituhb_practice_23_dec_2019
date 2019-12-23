package TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Shruthi\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\test\\resources\\skeleton\\BGCUCU.feature",
        glue= {"BGFEATUREJAVA"},
        plugin= {"pretty","html:target/cucumber-html-report"})
public class RunnerClass {

}
