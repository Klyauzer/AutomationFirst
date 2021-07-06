package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertFalse;
public class TaskSix extends BasePage {
    public TaskSix(WebDriver driver) {
        super(driver);
    }

    public TaskSix fillInLogin(String login) throws InterruptedException {
        sleep(500);
        writeText(By.id("LoginForm__username"), login);
        return this;
    }

    public TaskSix fillInPassword(String password) {
        writeText(By.name("LoginForm[_password]"), password);
        return this;
    }

    public TaskSix loginButtonClick() {
        click(By.xpath("//button[text()='Login']"));
        return this;
    }

    public TaskSix isLoginCorrect() {
        isElementDisplayed(By.linkText("Pobierz plik"));
        return this;
    }

    public TaskSix isLoginWrong() {
        isElementNotDisplayed(By.linkText("Pobierz plik"));
        return this;
    }
}
