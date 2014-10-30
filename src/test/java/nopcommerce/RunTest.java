package nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



/**
 * Created by krish on 27/10/2014.
 */


@RunWith(Cucumber.class)
@Cucumber.Options(format= {"html:target/cucumber"},tags ="@Items")
public class RunTest {
}




