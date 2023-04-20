package Paskaitos.Paskaita6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PirkiniuKrepselioTestai {

    public static void main(String[]args){

        //per sita fail'a chromas atsidarys
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");
        //susikuriame tos klases objekta
        //i skliaustelius dedale argumenta driver, kuri apsiraseme praeitoje klaseje
        PirkiniuKrepselis krepselis = new PirkiniuKrepselis(driver);
        //iskvieciame metoda
        krepselis.cookies();
        krepselis.prekesKortele();
        krepselis.addToCart();
        driver.quit();

    }
}
