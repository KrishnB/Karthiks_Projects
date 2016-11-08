package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;
    public WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/karthik/Development/Karthiks_Projects/CucumberLearnings/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
