package Paskaitos.Paskaita8;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RdeWebSiteTest {
    //kvieciame savo metodus sioje klaseje
    private static WebDriver driver;
    private static HomePage homePage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }
    @Test
    public void  RdeHomePageTest(){
        homePage.goTo();

    }
}
