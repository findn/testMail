package pages;

import elements.ElementsMailPage;
import org.openqa.selenium.WebDriver;

public class MailPage {

    WebDriver driver;
    ElementsMailPage elementsMailPage;

    public MailPage(WebDriver driver) {
        this.driver = driver;
        elementsMailPage = new ElementsMailPage(driver);
    }

    public void openMail(String author){
        elementsMailPage.openMail(author);
    }

    public String authorText(){
        return elementsMailPage.authorMail();
    }

    public String themeMail(){
        return elementsMailPage.themeMail();
    }

    public String textMail(){
        return elementsMailPage.textMail();
    }
}
