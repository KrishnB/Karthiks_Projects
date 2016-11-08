package entities;

public class ValidLogin implements Logindetails{

    private String email;
    private String password;


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
