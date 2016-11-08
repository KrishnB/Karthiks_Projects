package core;


import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DataMapper;
import utils.DriverManager;

public class Basepage {

    static WebDriver driver;
    static DataMapper dataMapper;

    public Basepage() {
        this.driver = DriverManager.getDriver();
        dataMapper = new DataMapper();

    }

//    public void waitForElementToBePresent(By element, int timeout) {
//        WebDriverWait wait = new WebDriverWait(driver,timeout);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
//
//    }


}
