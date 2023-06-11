package uzduotys.ExtendTest;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BookingBase {

    //savybe
    protected static WebDriver driver;

    //base klaseje apsirasau viska apie driveri

    //apsirasome konstruktoriu
    public BookingBase (WebDriver driver){
        //priskiriame savo savyve driveri driveriui
        BookingBase.driver = driver;


        //isdidiname narsykles langa
        driver.manage().window().maximize();
        //palaukiame kol visi elementai bus uzkrauti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //pasirasau metoda, kuris nukreips i norima psl
    public static void goTo(){
        driver.get("https://www.booking.com/");

    }
}
