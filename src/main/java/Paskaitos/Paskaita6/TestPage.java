package Paskaitos.Paskaita6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestPage {
    private static Registracija registracija;
    private static Login2 login;
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        driver = new ChromeDriver();
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);


        //laukiama, kol visi elementai bus uzkrauti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //objektas
        registracija = new Registracija(driver);
    }


    @Test
    public void registracija2() throws InterruptedException {
        Registracija.ieiti();
        Registracija.registruotis();
        Registracija.forma();
    }

    @Test
    public void login() {
       Registracija.ieiti();
       Login2.loginWindown();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
