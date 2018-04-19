package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.MailPage;
import pages.MainPage;
import resoursec.StringsValues;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public MainPage mainPage;
    public MailPage mailPage;
    public StringsValues stringsValues = new StringsValues();
    WebDriver driver;

    @BeforeMethod()
    public void startDriver() {
        driver = new ChromeDriver();
        driver.get("https://mail.ru");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        mailPage = new MailPage(driver);
    }

    @AfterMethod()
    public void closeDriver() {
        driver.quit();

    }
}
