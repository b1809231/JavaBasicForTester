package Bai16_MoHinhPOM.testcases;


import Bai16_MoHinhPOM.pages.LoginPage;

public class LoginTest {

    //Khai báo đối tượng từng class page cần thiết để dùng cho class test cases
    LoginPage loginPage;

    public void testLoginSuccess(){
        loginPage = new LoginPage();
        System.out.println("*****TEST CASE LOGIN SUCCESS*****");
        //Truyền giá trị email và password đúng
        loginPage.loginCRM("admin@example.com", "123456");
        loginPage.verifyLoginSuccess();
    }

    public void testLoginWithEmailInvalid(){
        loginPage = new LoginPage();
        System.out.println("*****TEST CASE LOGIN FAIL*****");
        //Truyền giá trị email sai
        loginPage.loginCRM("admin123@example.com", "123456");
        loginPage.verifyLoginFail();
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();

        loginTest.testLoginSuccess();
        System.out.println("===========================");
        loginTest.testLoginWithEmailInvalid();
    }

}
