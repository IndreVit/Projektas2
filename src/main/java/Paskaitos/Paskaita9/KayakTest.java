package Paskaitos.Paskaita9;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KayakTest extends KayakBase {
    //turime pasiimti klases, kad galetume pasiekti tuos metodus
    private KayakHome kayakHome;

    //apsibreziame konstruktoriu be argumentu, nes kitaip mes klaida
    public KayakTest() {
        super(driver);
    }


    //reikia anotaciju
    //pirmas beforeclass

    @BeforeClass
    public static void setUp() {
        //driverio vieta
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        //objektas
        ChromeOptions options = new ChromeOptions();
        //naudojame savo objekta sukurta
        options.addArguments("--disable-notifications");
        //kadangi turime chrome driveri, tai i ji idedame options
        KayakBase.driver = new ChromeDriver(options);
        KayakBase.driver.manage().window().maximize();


    }

    //kuriame testa
    @Test
    //rasome metoda
    public void stayTest(){
        //panaudojame savo norimus metodus is praeitu klasiu
        KayakBase.goTo();
        KayakHome.stays();

    }

    //po testo apsirasome afterclass anotacija
    @AfterClass
    //kuriame metoda
    //visada tearDown
    public static void tearDown(){
        //isjungia narsykle
        driver.quit();
    }
}
