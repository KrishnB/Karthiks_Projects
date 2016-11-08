package steps;

import core.Homepage;
import core.Loginpage;
import core.Signuppage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entities.Signupdetails;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class HomepageSteps {

    WebDriver driver;
    @Given("^In a browser I enter \"([^\"]*)\"$")
    public void inABrowserIEnter(String url) throws Throwable {
        new Homepage().openHome(url);
    }

    @And("^I should be navigated to homepage$")
    public void iShouldBeNavigatedToHomepage() throws Throwable {
        boolean isOnHomepage   = new Homepage().isUserOnHomePage();
        Assert.assertTrue(isOnHomepage);
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        new Homepage().chooseToLogin();
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String passwd) throws Throwable {
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys(passwd);
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        WebElement submit = driver.findElement(By.cssSelector(".btn.btn-primary.btnFormSubmit"));
        submit.click();
    }

    @Then("^I should be able view my account details$")
    public void iShouldBeAbleViewMyAccountDetails() throws Throwable {
        List<WebElement> Check = driver.findElements(By.linkText("Logout"));
        Assert.assertEquals(1,Check.size());
    }

    @Then("^I should not be able view my account details$")
    public void iShouldNotBeAbleViewMyAccountDetails() throws Throwable {
        List<WebElement> Check = driver.findElements(By.linkText("Logout"));
        Assert.assertEquals(0,Check.size());
    }

    @And("^I enter Emailaddress as \"([^\"]*)\"$")
    public void iEnterEmailaddressAs(String usid) throws Throwable {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(usid);
    }

    @When("^I click on Signup button$")
    public void iClickOnSignupButton() throws Throwable {
         new Homepage().chooseToSignUp();
    }

    @And("^I enter Email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String mailid) throws Throwable {
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(mailid);
    }

    @And("^I enter Confirm Email as \"([^\"]*)\"$")
    public void iEnterConfirmEmailAs(String mailrep) throws Throwable {
        WebElement email = driver.findElement(By.name("email_repeat"));
        email.sendKeys(mailrep);
    }

    @And("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String rpass) throws Throwable {
        WebElement Rpass = driver.findElement(By.name("confirm_password"));
        Rpass.sendKeys(rpass);
    }


    @Then("^I should not be able to create account$")
    public void iShouldNotBeAbleToCreateAccount() throws Throwable {
        List<WebElement> signup = driver.findElements(By.linkText("Register"));
        Assert.assertEquals(0,signup.size());
    }

    @And("^I click on facebookIcon button$")
    public void iClickOnFacebookIconButton() throws Throwable {

    }

    @And("^I should be navigated to facebook page$")
    public void iShouldBeNavigatedToFacebookPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on GooglePlusIcon button$")
    public void iClickOnGooglePlusIconButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be navigated to googlePlus page$")
    public void iShouldBeNavigatedToGooglePlusPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter the From location as \"([^\"]*)\"$")
    public void iEnterTheFromLocationAs(String dep) throws Throwable {
        WebElement from = driver.findElement(By.name("bookingFormDeparture"));
        from.sendKeys(dep);
    }

    @And("^I enter the To location as \"([^\"]*)\"$")
    public void iEnterTheToLocationAs(String des) throws Throwable {
        WebElement to = driver.findElement(By.name("bookingFormDestination"));
        to.sendKeys(des);
    }

    @And("^I enter Pickup as \"([^\"]*)\"$")
    public void iEnterPickupAs(String day) throws Throwable {
        WebElement date = driver.findElement(By.xpath(String.format("//div[@class='react-datepicker__day'][text()='%s]",day)));
        date.click();
    }



    @And("^I click on Single Trip$")
    public void iClickOnSingleTrip() throws Throwable {

    }
    

    @And("^I enter How many passengers as \"([^\"]*)\"$")
    public void iEnterHowManyPassengersAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter Any Additional Luggage as \"([^\"]*)\"$")
    public void iEnterAnyAdditionalLuggageAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on getquote button$")
    public void iClickOnGetquoteButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should not be able to book a cab$")
    public void iShouldNotBeAbleToBookACab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on Round Trip$")
    public void iClickOnRoundTrip() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should be able to book a cab$")
    public void iShouldBeAbleToBookACab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select a Title as \"([^\"]*)\"$")
    public void iSelectATitleAs(String tit) throws Throwable {
        WebElement title = driver.findElement(By.name("title"));
        Select titleDropDown = new Select(title);
        titleDropDown.deselectByVisibleText(tit);
    }

    @And("^I enter as FirstName as \"([^\"]*)\"$")
    public void iEnterAsFirstNameAs(String firstname) throws Throwable {
       WebElement firname = driver.findElement(By.name("first_name"));
        firname.sendKeys(firstname);
    }

    @And("^I enter as LastName as \"([^\"]*)\"$")
    public void iEnterAsLastNameAs(String lastname) throws Throwable {
       WebElement lasname = driver.findElement(By.name("last_name"));
        lasname.sendKeys(lastname);
    }

    @And("^I enter Contact mobile number as \"([^\"]*)\"$")
    public void iEnterContactMobileNumberAs(String num) throws Throwable {
        WebElement mob = driver.findElement(By.name("customer_tel"));
        mob.sendKeys(num);

    }

    @And("^I enter Confirm mobile number as \"([^\"]*)\"$")
    public void iEnterConfirmMobileNumberAs(String cnum) throws Throwable {
        WebElement cmob = driver.findElement(By.name("customer_tel_repeat"));
        cmob.sendKeys(cnum);
    }

    @And("^I enter spassword as \"([^\"]*)\"$")
    public void iEnterSpasswordAs(String pass) throws Throwable {
        WebElement spasswd = driver.findElement(By.name("password"));
        spasswd.sendKeys(pass);
    }

    @And("^I enter town as \"([^\"]*)\"$")
    public void iEnterTownAs(String tow) throws Throwable {
        WebElement town = driver.findElement(By.name("customer_based_in"));
        town.sendKeys(tow);
    }

    @And("^I enter Hour as \"([^\"]*)\"$")
    public void iEnterHourAs(String htime) throws Throwable {
        WebElement hour = driver.findElement(By.id("hours"));
        Select hourtime = new Select(hour);
        hourtime.deselectByVisibleText(htime);
    }

    @And("^I enter minutes as \"([^\"]*)\"$")
    public void iEnterMinutesAs(String mtime) throws Throwable {
        WebElement minute = driver.findElement(By.id("minutes"));
        Select minutetime = new Select(minute);
        minutetime.deselectByVisibleText(mtime);
    }

    @And("^I Click on Register button$")
    public void iClickOnRegisterButton() throws Throwable {
        WebElement register = driver.findElement(By.className("button_black smaller common-button-submit hf-validated hf-valid"));
        register.click();
    }

    @And("^I enter loginDetails as (\\w+)$")
    public void iEnterLoginDetailsAsLoginDetails(String loginDetails) throws Throwable {
        new Loginpage().loginWith(loginDetails);
    }

    @And("^I enter signUpDetails as (\\w+)$")
    public void iEnterSignUpDetailsAsSignUpDetails(String signUpDetails) throws Throwable {
        new Signuppage().SignupWith(signUpDetails);
    }
}
