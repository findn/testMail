package pages;

import elements.ElementsMainPage;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;
    ElementsMainPage elementsMainPage;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        elementsMainPage = new ElementsMainPage(driver);
    }

    public void authorization(String login, String password) {
        elementsMainPage.enterLogin(login);
        elementsMainPage.enterPassword(password);
        elementsMainPage.authButtonClick();
    }

    public void logout() {
        elementsMainPage.logout();
    }
}
