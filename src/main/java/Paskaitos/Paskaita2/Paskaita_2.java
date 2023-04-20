package Paskaitos.Paskaita2;
//paskaita kaip atsidaryti nurodyta psl, pasirinkti elementa ir ji paspausti ar irasyti tam tikra reiksme
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Paskaita_2 {
//draiverio nuoroda
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
//atidarome narsykle
        WebDriver driver = new ChromeDriver();
        System.out.println("Initialize completed");
        driver.get("https://pigu.lt");

        //close uzdaro tik viena langa/tab'a
        driver.close();
        //su quit uzdaromi visi langai/tabai
        driver.quit();

        //copy xpath ir nurodo kelia
        //sukuriame elementa ir idedame xpath. sakome, kad rastu elementa
        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"cookie_block\"]/div/div/div[1]/div[2]/button[3]"));

        //ir jei ras, turi ji paspausti
        cookieNotice.click();

        //susikuriame elementa searchbox ir ieskome pagal xpath
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));

        //siunciame tam tikra reiksme, siuo atveju monitorius zodi
        searchBox.sendKeys("monitorius");

        //tuomet naudojame submit funkcija, kuri ivykdo paieska
        searchBox.submit();

    }
}





