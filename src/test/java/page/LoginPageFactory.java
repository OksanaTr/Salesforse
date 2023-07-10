package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory extends BasePage{
    @FindBy(id = "username")
    WebElement userLoginInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "login-button")
    WebElement LoginButton;

    @FindBy(className = "\"loginError\"")
    WebElement LoginError;

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    public void authorization(String userName, String password){
        userLoginInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        LoginButton.click();
    }

    }

