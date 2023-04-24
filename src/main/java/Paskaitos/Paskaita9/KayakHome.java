package Paskaitos.Paskaita9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KayakHome extends KayakBase {


    private static final By stayButton = By.cssSelector("nav:nth-of-type(2) > div > a:nth-of-type(2)");
    //konstruktorius, kad paveldeti savybe, kuri yra KayakBase
    public KayakHome(WebDriver driver){
        //pasiimame ta savybe
        super(driver);
    }

    //metodas

//    public static void goTo(){
//        driver.get("https://www.kayak.com/");
//    }
    //static reikia, kad pasiektume test'a
    //kitas metodas
    public static void  stays(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{//stay css: nav:nth-of-type(2) > div > a:nth-of-type(2)
            Thread.sleep(5000);
            WebElement stay = wait.until(ExpectedConditions.visibilityOfElementLocated(stayButton));
            stay.click();

        }catch (Exception e){
            System.out.println("Klaida spaudziant stay mygtuka" + e.getMessage());
        }



    }
}
