package Paskaitos.Paskaita8;

import Paskaitos.Paskaita6.Pigu;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;



public class PiguTest {
    private static BasePagePigu basePagePigu;
    private static PrisijungimasPigu prisijungimasPigu;
    private static MegstamiausiPigu megstamiausiPigu;
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        driver = new ChromeDriver();


        //objektas
       basePagePigu = new BasePagePigu(driver);
    }


    @Test
    public void test(){
        BasePagePigu.goTo();
        PrisijungimasPigu.registracija();
        PrisijungimasPigu.prisijungimas();
        MegstamiausiPigu.megstamiausi1();
    }




    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
