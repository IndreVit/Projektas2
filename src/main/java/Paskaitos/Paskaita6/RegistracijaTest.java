package Paskaitos.Paskaita6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistracijaTest {

    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        driver.manage().window().maximize();
        Registracija registracijosForma = new Registracija(driver);
        //registracijosForma.cookies();
        registracijosForma.ieiti();
        registracijosForma.registruotis();
        registracijosForma.forma();
        registracijosForma.registruotis();
        driver.quit();
    }
}
