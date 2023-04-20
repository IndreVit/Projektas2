package Paskaitos.Paskaita6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pigu {
    private static final By click = By.xpath("//*[@id=\"headeMenu\"]/li[1]/a/i");
    private static final By email1 = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[3]/input");
    private static final By password = By.xpath("//*[@id=\"passwordCont\"]/input");
    private static final By btn = By.xpath("//*[@id=\"loginModal\"]/div[1]/div[1]/form/div[6]/input");
    private static WebDriver driver;
    //private final By login = By.id("auth-login-tab");

    public Pigu(WebDriver driver) {
        this.driver = driver;
        driver.get("https://pigu.lt/");
    }


    public static void loginWindown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {

            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(click)).click();


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
