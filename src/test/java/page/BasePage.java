package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    static WebDriver driver;
    WebDriverWait wait;
    public static final String BASE_URL = "https://trusova6.my.salesforce.com/";
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public abstract void waitForPageLoaded();

    public String getCurrentUrl() { //проверка страницы на соответствие
        return driver.getCurrentUrl();
    }


    public boolean isElementPresent(By locator) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        boolean isPresent = !driver.findElements(locator).isEmpty();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return isPresent;
    }

    public void waitForElementDisplayed(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitForElementClickable(By locator){

        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
public boolean isExist(By locator){
        try {
            return driver.findElement(locator).isDisplayed();


        }catch (NoSuchElementException ex){
             System.out.println(""+ ex.getMessage());
             return false;
            }
}

}