package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsMainPage {
    WebDriver driver;

    @FindBy(id = "mailbox:login")
    private WebElement login;

    @FindBy(id = "mailbox:password")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Войти']")
    private WebElement authButton;

    @FindBy(xpath = "//a[@id='PH_logoutLink']")
    private WebElement logout;


    public ElementsMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void enterLogin(String username) {
        login.sendKeys(username);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void authButtonClick() {
        authButton.click();
    }

    public void logout() {
        logout.click();
    }

}
