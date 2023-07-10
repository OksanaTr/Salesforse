package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final static By HOME_TAB = By.xpath("//span[@class='slds-truncate' and text()='Home']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(HOME_TAB);
    }
    public HomePage openHomePage(){
        driver.get(BASE_URL + "lightning/page/home");
        return this;
    }}

