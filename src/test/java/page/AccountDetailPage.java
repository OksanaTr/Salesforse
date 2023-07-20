package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetailPage extends  BasePage {
    private final By DETAILS_TITLE = By.xpath("//a[data-label='Details']");
    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class,'field-value')]";
    public AccountDetailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//*[@class='tabHeader' and @title='Details'])[1]")
    WebElement accountsDetails;

    @FindBy(xpath="(//*[@class='slds-form-element__control slds-grid itemBody']//span)[8]")
    WebElement accountName;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[11]")
    WebElement accountPhone;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[16]")
    WebElement accountFax;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[19]")
    WebElement accountNumber;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[22]")
    WebElement accountWebsite;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[25]")
    WebElement accountSite;

    public AccountDetailPage(WebDriver driver, WebElement accountsDetails, WebElement accountName, WebElement accountPhone, WebElement accountFax, WebElement accountNumber, WebElement accountWebsite, WebElement accountSite) {
        super(driver);
        this.accountsDetails = accountsDetails;
        this.accountName = accountName;
        this.accountPhone = accountPhone;
        this.accountFax = accountFax;
        this.accountNumber = accountNumber;
        this.accountWebsite = accountWebsite;
        this.accountSite = accountSite;
    }

    public WebElement getAccountsDetails() {
        return accountsDetails;
    }

    public void setAccountsDetails(WebElement accountsDetails) {
        this.accountsDetails = accountsDetails;
    }

    public WebElement getAccountName() {
        return accountName;
    }

    public void setAccountName(WebElement accountName) {
        this.accountName = accountName;
    }

    public WebElement getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(WebElement accountPhone) {
        this.accountPhone = accountPhone;
    }

    public WebElement getAccountFax() {
        return accountFax;
    }

    public void setAccountFax(WebElement accountFax) {
        this.accountFax = accountFax;
    }

    public WebElement getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(WebElement accountNumber) {
        this.accountNumber = accountNumber;
    }

    public WebElement getAccountWebsite() {
        return accountWebsite;
    }

    public void setAccountWebsite(WebElement accountWebsite) {
        this.accountWebsite = accountWebsite;
    }

    public WebElement getAccountSite() {
        return accountSite;
    }

    public void setAccountSite(WebElement accountSite) {
        this.accountSite = accountSite;
    }

    @Override
    public boolean isPageOpen() {
        return (DETAILS_TITLE);
    }

}

