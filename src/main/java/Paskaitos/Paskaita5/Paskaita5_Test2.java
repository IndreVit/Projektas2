package Paskaitos.Paskaita5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Paskaita5_Test2 {
    public static void main (String[]args) {
        //nurodau driverio lokacija
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");

        //susikuriu objekta
        Paskaita5_Test2 ieskauPrekiu = new Paskaita5_Test2();
        ieskauPrekiu.paieska();
    }

    //kuriu metoda
    public void paieska() {
        //apsibreziu driveri, nes kitaip neras
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rde.lt/");
        //Thread.sleep(3000);
        WebElement sutikimas = driver.findElement(By.xpath("//*[@id=\"js_cookie_window\"]/p/a[2]"));
        sutikimas.click();
        //WebElement x = driver.findElement(By.xpath("//*[@id=\"LP-79004w4\"]/div[2]/div/div[4]/button"));

        String[] zodziai = {"Kompiuteris","televizorius"};



        for(String paieska1 : zodziai){
            //reikia rasyti for'e, kad vis suktusi sitas elementas, nes parasius isoreje sustoja po vieno karto
            //pirmame pvz rasyta buvo isoreje, nes lyginome
            WebElement paieska25 = driver.findElement(By.xpath("/html/body/main/header/div/form/input"));
            //sunciame savo masyvo reiksmes
            paieska25.sendKeys(paieska1);
            //submitinam ta reiksme
           paieska25.submit();

            //atras visus pavadinimus ir sudes i masyva
            //List yra sarasas, kuris saugos visas webElemento reiksmes


            List<WebElement> pavadinimai = driver.findElements(By.xpath("//*[@id=\"main_container_wrapper\"]/ul[1]/li[1]/div[2]/div/h3"));
            //sudes cia visus elementus, kadangi nezinome dydzio, tai size pridedame
            //sukuriame masyva
            String[] products = new String[pavadinimai.size()];
            //naudojame for, kad eitu per visus pavadinimus masyve
            for(int i = 0; i <pavadinimai.size(); i++){
                //su get metodu gaus elementus
                //su getText metodu gausim pavadinima
                //susikuriame nauja masyva, i kuri sudesime praeito masyvo reiksmiu pavadinimus
                products[i] = pavadinimai.get(i).getText();


           }
            //isspausdiname pavadinimus. tam reikia dar vieno loop, nes eis per visas reiksmes. Pvz:
            //eis per kompiuterius, tada eis per televizorius ir t.t.
           System.out.println("Rasti produktai su zodziu:\"" + paieska1 + "\":");
           for (String product : products){
               System.out.println("-" + product);

           }
            driver.navigate().back();

           //list<WebElement> - sudes visus elementus musu i sarasa
        }
        //narsykle uzdarome nebe for metode, o po juo
        driver.quit();
    }
}
