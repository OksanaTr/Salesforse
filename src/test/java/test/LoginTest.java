package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void  loginTestWithValidData(){

            loginPage.openLoginPage();
            loginPage.loginAndPassword("museahe-g0nb@force.com","A258456a");
            loginPage.clickLogInButton();
            assertTrue(homePage.titleIsVisible());
        }
}
  