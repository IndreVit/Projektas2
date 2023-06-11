package uzduotys.ExtendTest;


import Paskaitos.Paskaita9.KayakBase;
import Paskaitos.Paskaita9.KayakHome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//paveldejima darau is base klases, nes ji turi savybe
public class BookingTest extends BookingBase {
    //turime pasiimti klases, kad galetume pasiekti tuos metodus
    private BookingHome bookingHome;

    //apsirasau konstruktoriu

    public BookingTest(){
        super(driver);
    }


    //apsirasau anotacijas
    @BeforeClass
    public static void setUp() {
        //driverio vieta
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        //objektas
        ChromeOptions options = new ChromeOptions();
        //naudojame savo objekta sukurta
        options.addArguments("--disable-notifications");
        //kadangi turime chrome driveri, tai i ji idedame options
        BookingBase.driver = new ChromeDriver(options);
        BookingBase.driver.manage().window().maximize();

    }

    @Test
    //metodas
    public void bookingTest (){
        //iskvieciame metodus is praeitu klasiu
        BookingBase.goTo();
        BookingHome.flightTab();
        BookingFlight.selectFlight();
    }

    @AfterClass
    //metodas
    public static void tearDown (){
        driver.quit();
    }
}
