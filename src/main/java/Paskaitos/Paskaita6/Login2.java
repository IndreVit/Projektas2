package Paskaitos.Paskaita6;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login2 {
    private static final By email1 = By.xpath("//*[@id=\"auth-login-panel\"]/form/div[2]");
    private static final By password = By.xpath("//*[@id=\"auth-login-panel\"]/form/div[3]/div");
    private static final By btn = By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/form/footer/div/button");
    private static WebDriver driver;
    //private final By login = By.id("auth-login-tab");

    public Login2(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.rde.lt/");
    }


    public static void loginWindown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(email1)).sendKeys("labas@lalalallala.lt");
            //email.sendKeys("labas@lalalallala.lt'");


            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("alalala");
           // pass.sendKeys("alalala");

            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(btn)).submit();
            //button.submit();

        } catch (Exception e) {
            System.out.println("error in login" + e.getMessage());
        }
    }
}

