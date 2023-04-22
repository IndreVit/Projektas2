package Paskaitos.Paskaita6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test {
    private static Pigu pigu;
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
        pigu = new Pigu (driver);
    }



    @org.junit.Test
    public void pigu() {
        // Registracija.ieiti();
        Pigu.loginWindown();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}


