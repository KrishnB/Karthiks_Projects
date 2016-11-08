package entities;


public class Signup {

    private ValidSignUp validSignUp;
    private InValidSignUp inValidSignUp;

    public ValidSignUp getValidSignUp() {
        return validSignUp;
    }

    public void setValidSignUp(ValidSignUp validSignUp) {
        this.validSignUp = validSignUp;
    }

    public InValidSignUp getInValidSignUp() {
        return inValidSignUp;
    }

    public void setInValidSignUp(InValidSignUp inValidSignUp) {
        this.inValidSignUp = inValidSignUp;
    }
}
