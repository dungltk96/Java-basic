package exercise.lab_13;

public class ExternalLoginPage extends LoginPage{
    public ExternalLoginPage(){
        loginPage = new SSOLogin();
    }
}
