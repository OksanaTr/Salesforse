package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String dropDownLocator = "//span[text()='%s']/ancestor::div[contains(@class, 'uiInputSelect')]//div[@class='uiMenu']";
    String dropDownParentAccount = "//div[@'visible')]//a[text() = '%s']";


    public DropDown(WebDriver driver, String type) {

    }

    public void write(String text){
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label))).sendKeys(text);
    }
    public void chooseParentAccount(String text){
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label))).clear();
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label))).click();
        driver.findElement(By.xpath(String.format(dropDownParentAccount))).click();

    }

    public void selectOption(String industry) {
    }
}

