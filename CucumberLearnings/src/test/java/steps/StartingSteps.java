package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverManager;

public class StartingSteps extends BaseSteps{

    @Before
    public void setup(){
        driver = new  DriverManager().createDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
