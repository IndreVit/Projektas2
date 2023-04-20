//package Paskaitos.Paskaita7;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeUnit;
//
//public class Registracija1 {{
//
//    private WebDriver driver;
//    private final By registerButton = By.xpath("/html/body/header/div/div[2]/a[2]");
//    private final By switchToLogin = By.xpath("//*[@id=\"auth-register-tab\"]");
//    private final By emailFieldLocator = By.xpath("//*[@id=\"registrationEmail\"]");
//
//
//    public void enterSite(WebDriver driver){
//        this.driver = driver;
//        driver.get("https://www.rde.lt/");
//    }
//
//    public void enterRegistrationPage(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//        WebElement enterLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
//        enterLogin.click();
//
//        WebElement switchToRegistration = wait.until(ExpectedConditions.visibilityOfElementLocated(switchToLogin));
//        switchToRegistration.click();
//    }
//
//    public void prefillRegInfo(email, password){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//        //enter email once the input field is visible
//        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFieldLocator));
//        emailField.sendKeys(email);
//
//        //enter password
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/form/div[1]/div[3]/div/input[2]")).sendKeys(password);
//
//        //repeat password
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/form/div[1]/div[4]/div/input[2]")).sendKeys(password);
//
//        //no marketing emails pls
//        driver.findElement(By.xpath("//*[@id=\"auth-register-panel\"]/form/div[1]/div[5]/label/span[1]")).click();
//
//        //submit form
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/form/div[1]/footer/button")).click();
//    }
//}
//}
