package Paskaitos.Paskaita6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PirkiniuKrepselis {

    //apsibreziame driveri
    private WebDriver driver;
    private final By addToCart = By.xpath("/html/body/main/div[4]/section/div[1]/div[2]/div[2]/div[4]/a");


    //susikuriame konstruktoriu
    //sklaistuose apsibreziame argumentus
    public PirkiniuKrepselis(WebDriver driver){
        //darome priskyrima savo argumentui
        this.driver = driver;
        //toliau reikia nuorodos. tam naudojame driveri, kuri ka tik priskyreme ir skliaustuose rasome nuoroda
        driver.get("https://www.rde.lt/");

    }


    public void cookies(){
        WebElement cookiesAccept = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
        cookiesAccept.click();
    }
    //susikuriame metoda, kuriame apsirasome produkta, kuri norime ideti i krepseli


    public void prekesKortele(){


      WebElement preke = driver.findElement(By.xpath("//*[@id=\"new-product-panel\"]/div[2]/ul/li[2]/a"));
      preke.click();

    }
    public void addToCart(){

        //driveri dar galima ir kitaip apsirasyt
        //WebElement addToCartButton = driver.findElement(By.xpath("/html/body/main/div[4]/section/div[1]/div[2]/div[2]/div[4]/a"));
        //addToCartButton.click();
        //reikia objekto, kuris palauktu, kol uzsikrautu mygtukas
        //skliaustuose reikia dviju rgumentu
        //nurodome driver, ir antroje vietoje laika, kuri lauksime
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //dabar reikia panaudoti laukimo objekta
        //xpath nurodome krepselio vieta
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[4]/section/div[1]/div[2]/div[2]/div[3]/a/span")));
        WebElement addProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
        addProduct.click();
        //implicitly wait - laukia kol visi elementai bus uzkrauti
        //explicit wait - laukia kol tam tikras vienas elementas bus uzkrautas

    }


}
