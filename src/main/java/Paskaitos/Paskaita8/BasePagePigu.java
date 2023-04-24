package Paskaitos.Paskaita8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasePagePigu {

    //apsirasau viska apie driveri
//su protected apsaugome web driveri nuo kitu klasiu
    protected static WebDriver driver;

    // kuriame konstruktoriu
    public BasePagePigu (WebDriver driver){
        //darome priskyrima
        this.driver = driver;

        //padidiname langa narsykles
        driver.manage().window().maximize();
        //laukiama, kol visi elementai bus uzkrauti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        WebDriver driver = new ChromeDriver(options);
    }

    //susikuriu metoda, kuris nuves i pigu puslapi
    public static void goTo() {
        driver.get("https://pigu.lt/lt/");
    }

}
