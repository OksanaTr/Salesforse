package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage{
    public static final By BREADCRUMB_LABEL = By.xpath(
            "//div[contains(@class, 'slds-breadcrumb')]//span[text() ='Accounts']");

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMB_LABEL);
    }
    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage openAccountPage(){
        driver.get(BASE_URL + "lightning/o/Account/list");
        return this;
    }
    public AccountListPage clickNewButton(){
        driver.findElement(NEW_BUTTON);
        return this;
    }

    public AccountListPage open() {
        driver.get(BASE_URL + "lightning/o/Account/list");
        return this;
    }

   }
