package Paskaitos.Paskaita6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
   private static final By login1 = By.cssSelector("div:nth-of-type(2) > a[role='button']");

    private static final By loginEmailField = By.cssSelector("input#loginEmail");
    private static final By password = By.cssSelector("form[name='login_form'] > div:nth-of-type(3) > .form-control.form-control--float.form-control--input > input:nth-of-type(2)");
    private static final By btn = By.cssSelector("[data-ajax-form-success-redirect-url] button");
    private static WebDriver driver;
    //private final By login = By.id("auth-login-tab");

    public Login(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.rde.lt/");
    }


    public static void loginWindown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(login1)).click();


            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmailField)).sendKeys("labas@lalalallala.lt");


            Thread.sleep(3000);
            //WebElement pass = driver.findElement(By.id("loginPassword"));
            WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
            //wait.until(ExpectedConditions.visibilityOfElementLocated((By) pass));
            pass.sendKeys("alalala");

            Thread.sleep(3000);
            //WebElement button = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/form/footer/div/button"));
            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
            //wait.until(ExpectedConditions.elementToBeClickable(button));
            button.submit();

        } catch (Exception e) {
            System.out.println("error in login" + e.getMessage());
        }
    }
}
