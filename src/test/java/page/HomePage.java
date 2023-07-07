package page;

import net.bytebuddy.description.NamedElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class HomePage extends BasePage {
    private final static By HOME_TAB = By.xpath("//span[@class='slds-truncate' and text()='Home']");


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean titleIsVisible() {

        return driver.findElement(HOME_TAB).isDisplayed();
    }}

