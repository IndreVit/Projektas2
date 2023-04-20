package Paskaitos.Paskaita6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registracija {
    private static WebDriver driver;

    public Registracija (WebDriver driver){
        this.driver = driver;
        driver.get("https://www.rde.lt/");
    }

//    public void cookies(){
//      WebElement cookie  = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
//      cookie.click();
//    }
    public static void ieiti(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
           // wait.until(ExpectedConditions.visibilityOfElementLocated(ieiti1));
            WebElement ieiti1 = driver.findElement(By.xpath("/html/body/header/div/div[2]/a[2]"));
            wait.until(ExpectedConditions.elementToBeClickable(ieiti1));
            ieiti1.click();
        } catch (Exception e){
            System.out.println("Neranda elemento ieiti" + e.getMessage());
        }

    }

    public static void registruotis(){
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement registracija = driver.findElement(By.xpath("//*[@id=\"auth-register-tab\"]"));
            wait2.until(ExpectedConditions.elementToBeClickable(registracija));
            registracija.click();
        }catch (Exception e){
            System.out.println("Neranda elemento registruotis" + e.getMessage());
        }
    }

    public static void forma() throws InterruptedException {
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement email = driver.findElement(By.xpath("//*[@id=\"registrationEmail\"]"));
            wait3.until(ExpectedConditions.elementToBeClickable(email));
            email.sendKeys("labas@lalalallala.lt");



        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("(//input[@id='registrationPassword'])[2]"));
        wait3.until(ExpectedConditions.elementToBeClickable(pass));
        pass.click();
        pass.sendKeys("alalala");

        Thread.sleep(1000);
        WebElement pass2 = driver.findElement(By.xpath("(//input[@id='registrationPasswordRepeat'])[2]"));
        wait3.until(ExpectedConditions.elementToBeClickable(pass2));
        pass2.sendKeys("alalala");

        Thread.sleep(1000);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"auth-register-panel\"]/form/div/footer/button/span"));
        wait3.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        }catch (Exception e){
            System.out.println("error in registration form" + e.getMessage());
        }
    }
}
