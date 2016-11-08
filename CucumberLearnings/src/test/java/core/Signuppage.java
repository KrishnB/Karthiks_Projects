package core;


import entities.Signup;
import entities.Signupdetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signuppage extends Basepage {

    private WebDriver driver;

    public Signuppage(){
        this.driver = super.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "email")
    private WebElement mailIdTextBox;

    @FindBy(name = "email_repeat")
    private WebElement mailId_repeatTextBox;

    @FindBy(name = "password")
    private WebElement passwdBox;

    @FindBy(name = "confirm_password")
    private WebElement passwd_repeatBox;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "first_name")
    private WebElement firstNameBox;

    @FindBy (name = "last_name")
    private WebElement lastNameBox;

    @FindBy(name = "customer_tel")
    private WebElement numBox;

    @FindBy(name = "customer_tel_repeat")
    private WebElement num_repeatBox;

    @FindBy(xpath = "//button[text()='Register ']")
    private WebElement registerButton;


    public void signUpAs(Signupdetails signupdetails){

        mailIdTextBox.clear();
        mailIdTextBox.sendKeys(signupdetails.getMailId());

        mailId_repeatTextBox.clear();
        mailId_repeatTextBox.sendKeys(signupdetails.getConfirmMailId());

        passwdBox.clear();
        passwdBox.sendKeys((signupdetails.getPassword()));

        passwd_repeatBox.clear();
        passwd_repeatBox.sendKeys(signupdetails.getConfirmPassword());

        Select titleDropDown = new Select(title);
        titleDropDown.selectByVisibleText(signupdetails.getTitle());

        firstNameBox.clear();
        firstNameBox.sendKeys(signupdetails.getFirstName());

        lastNameBox.clear();
        lastNameBox.sendKeys(signupdetails.getLastName());

        numBox.clear();
        numBox.sendKeys(signupdetails.getMobileNum());

        num_repeatBox.clear();
        num_repeatBox.sendKeys(signupdetails.getConfirmMobileNum());

        registerButton.click();
    }

    public void SignupWith(String signupdata)throws InterruptedException {
        Signup signupdetails =  setUpSignUpData();
        if(signupdata.equals("validSignUp")) {
            signUpAs(signupdetails.getValidSignUp());
        } else if (signupdata.equals("InvalidSignUp")) {
            signUpAs(signupdetails.getInValidSignUp());
        }

    }

    public Signup setUpSignUpData(){
        String signupDetailPath = "/home/karthik/Development/Karthiks_Projects/CucumberLearnings/src/test/resources/testData/SignUpDetails.json";
        Signup signup = (Signup) dataMapper.mapDetails(Signup.class, signupDetailPath);
        return signup;
    }



}
