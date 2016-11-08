package core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage extends Basepage{


    public Homepage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Sign up")
    private WebElement signUpPageLink;

    @FindBy(linkText = "Login")
    private WebElement loginPageLink;

    @FindBy(id = "logo")
    private List<WebElement> logoElement;

    public void chooseToLogin(){
        loginPageLink.click();
    }

    public void chooseToSignUp(){
        signUpPageLink.click();
    }

    public boolean isUserOnHomePage() {
        return logoElement.size()==1;
    }

    public void openHome(String url) {
        driver.get(url);
    }
}
