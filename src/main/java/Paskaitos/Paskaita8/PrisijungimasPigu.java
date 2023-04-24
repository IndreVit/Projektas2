package Paskaitos.Paskaita8;
//Testuojam123 -pass gmail
//gmail: testuojamVCS@gmail.com

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//paveldi basepagepigu klases savybes
public class PrisijungimasPigu extends BasePagePigu {

    //apsirasome savo savybes
    private static final By cookies = By.xpath("//*[@id=\"cookie_block\"]/div/div/div[1]/div[2]/button[3]");
    private static final By ikona = By.cssSelector("ul#headeMenu > li:nth-of-type(1) > a > .c-icon--profile");
    private static final By registruotisBTN =
            By.cssSelector("[widget] [rel-widget-id='loginModal']:nth-of-type(1) [rel-widget-id='loginModal']");
    private static final By registrationEmail =
            By.cssSelector("[class='col-1-of-2 register-details'] [placeholder='El\\. paštas']");
    private static final By registrationPass = By.cssSelector("div#passwordContPopup > input[name='password']");
    private static final By registrationRepeatPass = By.cssSelector("div#passwordContPopupRepeat > input[name='passconf']");
    private static final By taisykles = By.cssSelector("[widget-data='\\{\\\"policiesSeen\\\"\\:false\\}'] .icheck-item");
    private static final By taisyklesLentele = By.cssSelector("#policiesButtonApprove");
    private static final By registruotis = By.cssSelector("[class='col-1-of-2 register-details'] .btn-primary");
    private static final By prisijungimoEmail =
            By.cssSelector("div:nth-of-type(1) > .col-1-of-2.login-details > form[method='post']  input[name='email']");
    private static final By prisijungimoPass = By.cssSelector("div#passwordCont > input[name='password']");
    private static final By prisijungti = By.cssSelector("input[name='login']");


    //sukuriu konstruktoriu

    public PrisijungimasPigu(WebDriver driver) {
        //super reikia, kad galetume panaudoti savybe
        super(driver);
    }

//    //susikuriame main metoda
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
//        PrisijungimasPigu registracijaPigu = new PrisijungimasPigu(driver);
//        registracijaPigu.goTo();
//        registracijaPigu.registracija();
//        registracijaPigu.prisijungimas();
//
//
//    }

    //metodas nueiti i pigu puslapi
//    public static void goTo() {
//        driver.get("https://pigu.lt/lt/");
//    }

    //susikuriu metoda registracija, kur apsirasau savo norimas savybes
    public static void registracija() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(cookies)).click();
        } catch (Exception e) {
            System.out.println("Neranda cookies mygtuko" + e.getMessage());
        }
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(ikona)).click();
        } catch (Exception e) {
            System.out.println("Neranda ikonos" + e.getMessage());
        }


        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(registruotisBTN)).click();
        } catch (Exception e) {
            System.out.println("Neranda registruotis mygtuko" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(registrationEmail)).
                    sendKeys("testuojamVCS@gmail.com");
        } catch (Exception e) {
            System.out.println("Klaida vedant el pasta" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(registrationPass)).
                    sendKeys("Testuojam123PIGU");
        } catch (Exception e) {
            System.out.println("Klaida vedant slaptazodi" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(registrationRepeatPass)).
                    sendKeys("Testuojam123PIGU");
        } catch (Exception e) {
            System.out.println("Klaida kartojant slaptazodi" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(taisykles)).click();
        } catch (Exception e) {
            System.out.println("Klaida zymint varnele" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(taisykles)).click();
        } catch (Exception e) {
            System.out.println("Klaida zymint varnele" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(taisyklesLentele)).click();
        } catch (Exception e) {
            System.out.println("Klaida taisykliu lenteleje" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            ;
            wait.until(ExpectedConditions.visibilityOfElementLocated(registruotis)).click();
        } catch (Exception e) {
            System.out.println("Klaida spaudziant registruotis mygtuka" + e.getMessage());
        }
    }

    public static void prisijungimas() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(ikona)).click();
        } catch (Exception e) {
            System.out.println("Neranda ikonos" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(prisijungimoEmail)).
                    sendKeys("testuojamVCS@gmail.com");
        } catch (Exception e) {
            System.out.println("Klaida vedant prisijungimo email" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(prisijungimoPass)).
                    sendKeys("Testuojam123PIGU");
        } catch (Exception e) {
            System.out.println("Klaida vedant prisijungimo slaptazodi" + e.getMessage());
        }

        try {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(prisijungti)).click();
        } catch (Exception e) {
            System.out.println("Klaida spaudziant prisijungti" + e.getMessage());
        }

    }
}


