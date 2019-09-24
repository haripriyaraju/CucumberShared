package calculator;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:src/test/java/calculator/output/cucumber.json"})
public class runner {
	

}
