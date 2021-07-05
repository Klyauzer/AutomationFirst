package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class TaskSix extends BasePage {
    public TaskSix(WebDriver driver) {
        super(driver);
    }

    public TaskSix fillInLogin(String login) throws InterruptedException {
        sleep(500);
        writeText(By.id("LoginForm__username"), login);
        return this;
    }

    public TaskSix fillInPassword(String password){
        writeText(By.name("LoginForm[_password]"), password);
        return this;
    }

    public TaskSix loginButtonClick(){
        click(By.xpath("//button[text()='Login']"));
        return this;
    }

    public TaskSix isLoginCorrect(){
        driver.findElement(By.linkText("Pobierz plik")).isDisplayed();
        return this;
    }
}
