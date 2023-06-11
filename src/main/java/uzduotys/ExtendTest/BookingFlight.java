package uzduotys.ExtendTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//paveldi base klase, nes ten yra savybe
public class BookingFlight extends BookingBase{

    private static final By goToAirport = By.cssSelector(".k_my-input");
   // private static final By oneWay = By.cssSelector("li#oneway > span");
    //konstruktorius
    public BookingFlight(WebDriver driver){
        super(driver);
    }


    // kuriame metodus
    public static void selectFlight(){
        //wait, kol uzkraus elementtus
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //try, kad pagauti, jei yra klaida
        try{Thread.sleep(3000);
            WebElement airport = wait.until(ExpectedConditions.elementToBeClickable(goToAirport));
            airport.click();
            airport.sendKeys("heathwor");
            airport.submit();


        }catch (Exception e){
            System.out.println("Klaida select flight" + e.getMessage());
        }



    }
}
