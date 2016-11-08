package core;

import entities.Login;
import entities.Logindetails;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Loginpage extends Basepage{

    private WebDriver driver;

    public Loginpage(){
        this.driver = super.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    private WebElement emailTextBox;

    @FindBy(name = "pass")
    private WebElement passwordTextBox;

    @FindBy(css = ".btn.btn-primary.btnFormSubmit")
    private WebElement submitButton;

    public void loginas(Logindetails loginDetails){
        emailTextBox.clear();
        emailTextBox.sendKeys(loginDetails.getEmail());
        passwordTextBox.clear();
        passwordTextBox.sendKeys(loginDetails.getPassword());
        submitButton.click();
        waitForUserToLogin();
    }

    public void loginWith(String loginData)throws InterruptedException {
        Login loginDetails =  setupLoginData();
        if(loginData.equals("validLogin")) {
           loginas(loginDetails.getValidLogin());
        } else if (loginData.equals("invalidLogin")) {
            loginas(loginDetails.getInValidLogin());
        }
    }

    private Login setupLoginData() {
        String loginDetailsPath = "/home/karthik/Development/Karthiks_Projects/CucumberLearnings/src/test/resources/testData/LoginDetails.json";
        Login loginDetails = (Login) dataMapper.mapDetails(Login.class,loginDetailsPath);
        return loginDetails;
    }

    public void waitForUserToLogin(){
        List<WebElement> Check = driver.findElements(By.linkText("Logout"));
        Assert.assertEquals(1,Check.size());
    }

    public void isWeCanAbleToLogin(){

    }
}
