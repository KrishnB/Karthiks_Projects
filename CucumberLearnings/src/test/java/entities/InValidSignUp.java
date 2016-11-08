package entities;


public class InValidSignUp implements Signupdetails {

    private String mailId;
    private String confirmMailId;
    private String password;
    private String confirmPassword;
    private String title;
    private String firstname;
    private String lastname;
    private String mobileNum;
    private String confirmMobileNum;

    public String getMailId() {
        return mailId;
    }

    public String getConfirmMailId() {
        return confirmMailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public void setConfirmMailId(String mailIdRepeat) {
        this.confirmMailId = mailIdRepeat;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String passwordRepeat) {
        this.confirmPassword = passwordRepeat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getConfirmMobileNum() {
        return confirmMobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setConfirmMobileNum(String mobileNumRepeat) {
        this.confirmMobileNum = mobileNumRepeat;
    }
}
