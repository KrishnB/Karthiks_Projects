package entities;


public class Login {

    private ValidLogin validLogin;
    private InValidLogin inValidLogin;

    public ValidLogin getValidLogin() {
        return validLogin;
    }

    public void setValidLogin(ValidLogin validLogin) {
        this.validLogin = validLogin;
    }

    public InValidLogin getInValidLogin() {
        return inValidLogin;
    }

    public void setInValidLogin(InValidLogin inValidLogin) {
        this.inValidLogin = inValidLogin;
    }

}
