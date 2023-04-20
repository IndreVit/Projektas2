package Paskaitos.Paskaita6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
   // private static final By login1 = By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[1]/div/a[1]");

    //private static final By loginEmailField = By.xpath("//input[@id=\"loginEmail\"]");
    private static final By password = By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/form/div[3]/div/input[2]");
    private static final By btn = By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[1]/form/footer/div/button");
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
            //WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(login1));
            //WebElement login = driver.findElement(By.xpath("//*[@id=\"auth-login-tab\"]"));
           // wait.until(ExpectedConditions.visibilityOfElementLocated((By) login));
            //login.click();

//            Thread.sleep(3000);
//            WebElement gmailIcon = driver.findElement(By.xpath("//*[@id=\"auth-login-panel\"]/div/div/div/a[2]"));
//            gmailIcon.click();

//WebElement addProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
//            WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmailField));
//            //wait.until(ExpectedConditions.visibilityOfElementLocated((By) email));
//            Thread.sleep(3000);
//            email.sendKeys("labas@lalalallala.lt");

            WebElement email = driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")); // you can use any locator
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].value='labas@lalalallala.lt';", email);

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
