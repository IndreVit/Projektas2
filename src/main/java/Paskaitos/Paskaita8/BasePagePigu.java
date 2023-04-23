package Paskaitos.Paskaita8;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePagePigu {

    //apsirasau viska apie driveri
//su protected apsaugome web driveri
    protected static WebDriver driver;

    // kuriame konstruktoriu
    public BasePagePigu (WebDriver driver){
        //darome priskyrima
        this.driver = driver;

        //padidiname langa narsykles
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void goTo() {
        driver.get("https://pigu.lt/lt/");
    }

}
