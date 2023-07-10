package test;

import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {
    @Test
    public void accountShouldBeCreated() {
        loginPage.openLoginPage()
                .enterData("museahe-g0nb@force.com","A258456a")
                .clickLoginButton();
        accountListPage.openAccountPage();
        accountListPage.clickNewButton();
        accountModalPage.isPageOpen();
        Account account = new Account("TestName", "avito.ru");
        accountModalPage.create(account);
        accountModalPage.clickSaveButton()
                .isPageOpen();
    }
}
