import helpers.TestBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebDriverTest extends TestBase {

    @Test
    public void checkMailTest() throws InterruptedException {
        mainPage.authorization(stringsValues.loginTest, stringsValues.passwordTest);
        mailPage.openMail(stringsValues.author);
        System.out.println("dsadsadsdsaad");
        assertThat(mailPage.textMail()).isEqualTo(stringsValues.textMail);
        assertThat(mailPage.authorText()).isEqualTo(stringsValues.author);
        assertThat(mailPage.themeMail()).isEqualTo(stringsValues.theme);
    }

    @AfterMethod(alwaysRun = true)
    public void logout(){
        mainPage.logout();
    }

}
