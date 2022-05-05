package exercise.lab_13;
/*
Please use Strategy Design Pattern to solve below problem
ILogin: login
NormalLogin implements ILogin
SSOLogin implements ILogin

LoginPage - abstract
InternalLoginPage use normal login type
ExternalLoginPage use SSO type
*/

public interface ILogin {
    void loginType();
}
