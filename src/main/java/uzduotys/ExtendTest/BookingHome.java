package uzduotys.ExtendTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//darau paveldejima bookingbase klases
public class BookingHome extends BookingBase {

    private static final By acceptCookies = By.cssSelector("#onetrust-accept-btn-handler");
    private static final By flightSection = By.cssSelector("a#flights  .db29ecfbe2");

    //apsirasau konstruktoriu
    ////konstruktorius, kad paveldeti savybe, kuri yra booking base
    public BookingHome(WebDriver driver) {
        //pasiimame ta savybe
        super(driver);
    }

    //apsirasau visus norimus metodus


    public static void flightTab() {
        //wait, kol uzkraus elementtus
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //try, kad pagauti, jei yra klaida
        try {
            WebElement accept = wait.until(ExpectedConditions.visibilityOfElementLocated(acceptCookies));
            accept.click();

        } catch (Exception e) {
            System.out.println("Klaida cookies" + e.getMessage());
        }

        try {
            WebElement flight = wait.until(ExpectedConditions.visibilityOfElementLocated(flightSection));
            flight.click();

        } catch (Exception e) {
            System.out.println("Klaida spaudziant ant flight sekcijos" + e.getMessage());
        }


    }
}
