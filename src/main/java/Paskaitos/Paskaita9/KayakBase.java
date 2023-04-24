package Paskaitos.Paskaita9;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class KayakBase {
    protected static WebDriver driver;

    //apsirasome driveri, kuri paveldesime kitose klasese, tad jo nereikes apsirasinet kitose klases
    //konstruktorius
    //skliaustuose apsirasome savybe
    public KayakBase (WebDriver driver){
        //darome savybes priskyrima tam tikrai reiksmei
        //kayakbase rasome, kad neraudonuotu ir nesipjautu
        KayakBase.driver=driver;

        //
        driver.manage().window().maximize();
        //duration ogjektas
        //ofSeconds metodas
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    //goTO metoda rasome base

    public static void goTo(){
        driver.get("https://www.kayak.com/");
    }
}
