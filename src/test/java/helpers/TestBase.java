package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MailPage;
import pages.MainPage;
import resoursec.StringsValues;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public MainPage mainPage;
    public MailPage mailPage;
    public StringsValues stringsValues = new StringsValues();
    WebDriver driver;

    @BeforeClass()
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\FK\\Downloads\\chromedriver_win32\\1.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.ru");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        mailPage = new MailPage(driver);

    }

    @AfterClass()
    public void closeDriver() {
        driver.quit();

    }
}
