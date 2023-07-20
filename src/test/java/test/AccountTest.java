package test;

import models.Account;
import org.testng.annotations.Test;
import test.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest {

    @Test
            .

    public void accountShouldBeCreated() {
        loginPage.openLoginPage()
                .enterData("museahe-g0nb@force.com","A258456a")
                .clickLoginButton();


        //открыть страницу аккаунт
        accountListPage.open()
                //кликнуть кнопку new
                .clickNewButton();
        Account account = new Account("Test Name","www.avito.ru","458766","hardmetall","Investor",
                "125489", "20","10000", "BlaBla", "Pobedy",
                "Gorod", "125486","Vitebsk","Belarus","lalala",
                "Gomel", "Belarus", "2175463", "Belarus");
        //заполнить все поля
        accountModalPage.create(account);
        //нажать кнопку save
        Assert.assertEquals(accountDetailPage.getFieldValue("Account Name"),account.getAccountName());
        Assert.assertEquals(accountDetailPage.getFieldValue("Phone"),account.getPhone());
        Assert.assertEquals(accountDetailPage.getFieldValue("Fax"),account.getFax());
        Assert.assertEquals(accountDetailPage.getFieldValue("Website"),account.getWebSite());
        Assert.assertEquals(accountDetailPage.getFieldValue("Type"),account.getType());
        Assert.assertEquals(accountDetailPage.getFieldValue("Industry"),account.getIndustry());
        Assert.assertEquals(accountDetailPage.getFieldValue("Employees"),account.getEmployees());
        Assert.assertEquals(accountDetailPage.getFieldValue("Annual Revenue"),account.getAnnualRevenue());
        Assert.assertEquals(accountDetailPage.getFieldValue("Description"),account.getDescription());
        Assert.assertEquals(accountDetailPage.getFieldValue("Billing Street"),account.getBillingStreet());
        Assert.assertEquals(accountDetailPage.getFieldValue("Billing City"),account.getBillingCity());
        Assert.assertEquals(accountDetailPage.getFieldValue("Billing Zip"),account.getBillingZip());
        Assert.assertEquals(accountDetailPage.getFieldValue("Billing State"),account.getBillingState());
        Assert.assertEquals(accountDetailPage.getFieldValue("Billing Country"),account.getBillingCountry());
        Assert.assertEquals(accountDetailPage.getFieldValue("Shipping Street"),account.getShippingStreet());
        Assert.assertEquals(accountDetailPage.getFieldValue("Shipping City"),account.getShippingCity());
        Assert.assertEquals(accountDetailPage.getFieldValue("Shipping State"),account.getShippingState());
        Assert.assertEquals(accountDetailPage.getFieldValue("Shipping Zip"),account.getShippingZip());
        Assert.assertEquals(accountDetailPage.getFieldValue("Shipping Country"),account.getShippingCountry());




    }

}