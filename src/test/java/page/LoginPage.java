package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME = By.id("username");
   public final static By PASSWORD = By.id("pass");
    public final static By LOGINBUTTON = By.id("login");

    public LoginPage(WebDriver driver){
        super(driver);
    }

@Override
public boolean isPageOpen(){
        return isExist(LOGINBUTTON);
}
    public LoginPage openLoginPage(){
        driver.get(BASE_URL);
        return this;
    }
    public LoginPage enterData(String name,String password) {
        driver.findElement(USERNAME).sendKeys(name);
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }
    public HomePage clickLoginButton() {
        driver.findElement(LOGINBUTTON).click();
        return new HomePage (driver);
        }
    }








