package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static void clickLoginButton() {
    }

    @Override
    public void waitForPageLoaded() {

    }

    private final static String URL = "https://trusova6.lightning.force.com";
    private final static By PASSWORD = By.id("pass");
    private final static By LOGINBUTTON = By.id("login");
    public static final By USERNAME = By.id("username");

    public static void openLoginPage(){
        driver.get(BASE_URL);
    }


    public void loginAndPassword(String name,String password) {
        driver.findElement(USERNAME).sendKeys(name);
        driver.findElement(PASSWORD).sendKeys(password);
    }


    public boolean isPageOpen(){
        return isExist(LOGINBUTTON);
    }

    public void clickLogInButton(){
        driver.findElement(LOGINBUTTON).click();
    }

}





