package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsMailPage {
    WebDriver driver;

    @FindBy(css = "#b-letter > div.b-letter.b-letter_expanded > div.b-letter__head.b-letter__head_threads > div.b-letter__head__wrapper.js-head > div.js-contacts.b-contact-container > div.b-letter__head__addrs__from > span > span:nth-child(1)")
    private WebElement authorMail;

    @FindBy(xpath = "//div[@class='b-letter__head__subj__text']")
    private WebElement themeMail;

    @FindBy(xpath = "//*[@id=\"style_15239923530000000235_BODY\"]/div")
    private WebElement textMail;

    public ElementsMailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openMail(String author) {
        driver.findElement(By.xpath("//div[text()='" + author + "']")).click();
    }

    public String authorMail() {
        return authorMail.getText();
    }

    public String themeMail() {
        return themeMail.getText();
    }

    public String textMail() {
        return textMail.getText();
    }

}
