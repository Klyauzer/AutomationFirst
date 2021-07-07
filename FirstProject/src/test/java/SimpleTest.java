import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    final String SITE_URL = "https://testingcup.pgs-soft.com/";
    WebDriver driver;

    @BeforeEach
    public void start(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(SITE_URL);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }

    @Epic("TESTING FOR https://testingcup.pgs-soft.com/ tasks")
    @Feature(value = "Tests for task 6")
    @Severity(SeverityLevel.BLOCKER)
    @Description("In this test we will login with correct credentials. When we logged we see link for file.")
    @Story(value = "Test for login with correct credentials")

    @Test
    public void testSixCheckLoginWithCorrectCredentials(){
        driver.findElement(By.linkText("Zadanie 6")).click();
        driver.findElement(By.id("LoginForm__username")).sendKeys("tester");
        driver.findElement(By.id("LoginForm__password")).sendKeys("123-xyz");
        driver.findElement(By.id("LoginForm_save")).click();
        assertTrue(driver.findElements(By.linkText("Pobierz plik")).isEmpty());
    }

    @Test
    public void testSixCheckLoginWithIncorrectCredentials(){
        driver.findElement(By.linkText("Zadanie 6")).click();
        driver.findElement(By.id("LoginForm__username")).sendKeys("tester");
        driver.findElement(By.id("LoginForm__password")).sendKeys("12,4-xyw");
        driver.findElement(By.id("LoginForm_save")).click();
        assertTrue(driver.findElements(By.linkText("Pobierz plik")).isEmpty());
    }

}
