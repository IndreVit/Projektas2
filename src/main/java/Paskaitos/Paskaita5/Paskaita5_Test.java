package Paskaitos.Paskaita5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class Paskaita5_Test {
    //as noriu nusiusti tam tikras reiksmes i paieskos lauka ir kad palygintu ar tiketisi reiksme atitinka gauta


    //apsibreziu main metoda
    public static void main(String[]args){


        // nurodau driverio vieta
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");

        //reikia susikurti objekta, tam kad galeciau iskviesti driveri, kuris yra aprasytas metode

        Paskaita5_Test objektas = new Paskaita5_Test();
        objektas.paieskoslaukas();

    }

    //susikuriame metoda aprasytam objektui
    public void paieskoslaukas(){
        //susikuriu objekta driveriui, nes kitaip jo neras
        WebDriver driver = new ChromeDriver();
        driver.get("https://pigu.lt/lt/");

        //susikurti web elementa, kad paspausti sutikimo mygtuka, nes kitaip neveiks nieksa
        WebElement sutikimas = driver.findElement(By.xpath("//*[@id=\"cookie_block\"]/div/div/div[1]/div[2]/button[3]"));
        sutikimas.click();

        //susikuriame masyvaz odziu, kuriuos siusime i paieskos lauka

        String[] zodziai = {"patalyne", "zoliapjove"};

        //tuomet reikia for, kad pereitu per visas masyvo reiksmes
        for(String zodziai1:zodziai) {
            //rasome salyga
            //pirmiausia reikia surasti paieskos lauka
            WebElement paieskosLaukas = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
            //toliau as noriu siusti savo masyvo reiksmes i paieskos lauka. tam naudoju sendKeys
            paieskosLaukas.sendKeys(zodziai1);
            //tuomet noriu spausti enter, kad gauti paieskos rezultatus. tam naudoju submit
            paieskosLaukas.submit();
//            //tuomet noriu lyginnti ar gauta reiksme atitinka tiketasi reiksme
//            //tokiu atveju turiu susikurti 2 kitamuosius, kad galeciau juos palyginti
//            String tiketasiReiksme = zodziai1 + " | pigu.lt";
//            //gauta reiksme. tam naudoju getTitle
//            String gautaReiksme = driver.getTitle();
//            assertEquals(tiketasiReiksme,gautaReiksme);
            //kad vel suktusi is naujo procesas, tam reikia sugrizti atgal. tam naudojame navigate.back
            driver.navigate().back();


        }
        //kai for ivyksta, norime uzdaryti narsyklle
        driver.quit();

    }
}
