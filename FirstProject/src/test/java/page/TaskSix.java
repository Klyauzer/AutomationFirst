package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class TaskSix extends BasePage {
    public TaskSix(WebDriver driver) {
        super(driver);
    }

    public TaskSix fillInLogin(String login) throws InterruptedException {
        sleep(500);
//        WebElement element = driver.findElement(By.id("LoginForm__username"));
//        element.sendKeys(login);
        writeText(By.id("LoginForm__username"), login);
        return this;
    }

    public TaskSix fillInPassword(String password){
        writeText(By.name("LoginForm[_password]"), password);
//      driver.findElement(By.name("LoginForm[_password]")).sendKeys(password);
        return this;
    }

    public TaskSix loginButtonClick(){
//        driver.findElement(By.cssSelector(".btn-default.btn")).click();
        click(By.cssSelector(".btn-default.btn"));
        return this;
    }

    public TaskSix isLoginCorrect(){
//        isElementDisplayed(By.linkText("Pobierz plik"));
        driver.findElement(By.linkText("Pobierz plik")).isDisplayed();
        return this;
    }
}
