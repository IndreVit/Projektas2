package Paskaitos.Paskaita8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MegstamiausiPigu extends PrisijungimasPigu {
    private static final By paieska = By.cssSelector("input#searchInput");
    private static final By sirdutePrekes1 = By.cssSelector (".contain-button.product-block-67349619.product-item-55767659.product-list-item.tag-top .product-item__badges-item.wishlist > .add-to-favorites");
    private static final By megstamiausi = By.cssSelector("li:nth-of-type(3) > a > .c-icon--heart-line");
    private static final By sirdutePrekes2 = By.cssSelector(".contain-button.product-block-19494610.product-item-20194755.product-list-item.tag-top .product-item__badges-item.wishlist > .add-to-favorites");

    public MegstamiausiPigu(WebDriver driver) {
        //super reikia, kad galetume panaudoti savybe
        super(driver);
    }
    //susikuriame main metoda
//    public static void main(String[] args) {
//        //nurodau driverio vieta
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//
//        //susikuriu objekta, kad galeciau iskviesti savo metodus
//        MegstamiausiPigu megstamiausiProduktai = new MegstamiausiPigu(driver);
//        megstamiausiProduktai.goTo();
//        megstamiausiProduktai.registracija();
//        megstamiausiProduktai.prisijungimas();
//        megstamiausiProduktai.megstamiausi1();
//
//    }

    public static void megstamiausi1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(paieska)).sendKeys("kompiuteris");
            wait.until(ExpectedConditions.elementToBeClickable(paieska)).submit();
            wait.until(ExpectedConditions.visibilityOfElementLocated(sirdutePrekes1)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(megstamiausi)).click();
            wait.until(ExpectedConditions.elementToBeClickable(paieska)).sendKeys("virdulys");
            wait.until(ExpectedConditions.elementToBeClickable(paieska)).submit();
            wait.until(ExpectedConditions.visibilityOfElementLocated(sirdutePrekes2)).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(megstamiausi)).click();

        } catch (Exception e) {
            System.out.println("Nepridejo prie megstamiausiu prekiu" + e.getMessage());
        }
    }
}
