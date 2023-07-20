package test.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.*;
import test.AccountTest;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    AccountTest accountTest;
    public AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    AccountDetailPage accountDetailPage;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailPage = new AccountDetailPage(driver);
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}