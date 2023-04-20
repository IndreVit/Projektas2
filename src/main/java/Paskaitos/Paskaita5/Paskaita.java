package Paskaitos.Paskaita5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Paskaita {
    //draiverio nuoroda
    public static void main(String[] args) {
        //lokacija kur yra driveris
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\indre\\Desktop\\driveris\\chromedriver.exe");

        //reikia objekto, kad galetume paleisti savo metoda apsirasyta
        Paskaita test1 = new Paskaita();
        test1.googleSearch();


        }
    //kuriame metoda,
    public void googleSearch(){
        //apsibreziame driveri metode, nes kitaip driverio neras. cia susikureme driver objekta
        WebDriver driver = new ChromeDriver();
        //nurodome driveriui nuoroda, kuria reikia atidarytoi
        driver.get("https://google.com");

        //suskuriame elementa ir randame ji pagal xpath
        WebElement sutikimas = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        //paspaudziame click metodu ta sutikima
        sutikimas.click();
        //driver.quit();
        ////*[@id="APjFqb"]


        //susikuriame masyva tam tikru zodziu, kuriuos noresime siusti i google paieskos lauka
        String[] searchTerms = {"java", "selenium", "kompiuteris"};

        //galime susikurti kintamaji, bet nieko nepriskirti
        WebElement searchBox;
        //String term;
        //ir cia galime priskirti reiksme.
        // tai tas pats kas WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        //for(int i = 0; i<searchTerms.length; i++){
        //tas pats kas ir virsuje nurodyta salyga
        //term naujas kintamasis, bet taip rasant nereikia dar atskirai kurti
        for(String term : searchTerms){
           // term = searchTerms[i];
            //sunciame savo masyvo reiksmes.
            // rasome term, nes susikureme nauja kintamaji, kuriam priskyreme masyvo reiksmes
            searchBox.sendKeys(term);
            //submitinam ta nusiusta reiksme
            searchBox.submit();
            //susikuriam kintamaji reiksmes, kurios tikimes
            //zalias tekstas turi atitikti kas parasyta
            //term masyvo reiksme pridedame prie pasirasyto zalio teksto. tai yra reiksme, kurios mes tikimes
            String expectedValue = term + " - „Google“ paieška";
            //gaunam reiksme, kurios tikimes
            //metodas getTitle grazina esamo puslapio pavadinimą, kuris nurodytas tab'e
            String actualValue = driver.getTitle();
            //assertEquals metodas lygina at musu norima reiksme atitinka gauta reiksme
            assertEquals(expectedValue,actualValue);
            //paspaudziame back, kad vel galetu for ivykti. tam naudojame navigate ir back
            driver.navigate().back();
        }
        //narsykle uzdarome nebe for metode, o po juo
        driver.quit();


//
//
//
//        //copy xpath ir nurodo kelia
//        //sukuriame elementa ir idedame xpath. sakome, kad rastu elementa
//        WebElement cookieNotice = driver.findElement(By.xpath("//*[@id=\"cookie_block\"]/div/div/div[1]/div[2]/button[3]"));
//
//        //ir jei ras, turi ji paspausti
//        cookieNotice.click();
//
//        //susikuriame elementa searchbox ir ieskome pagal xpath
//        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
//
//        //siunciame tam tikra reiksme, siuo atveju monitorius zodi
//        searchBox.sendKeys("monitorius");
//
//        //tuomet naudojame submit funkcija, kuri ivykdo paieska
//        searchBox.submit();
//
//        //close uzdaro tik viena langa/tab'a
//        driver.close();
//        //su quit uzdaromi visi langai/tabai
//        driver.quit();

        //masyvo naudojimas/
        //turime reiksmes masyve ir gali siusti reiksmes i search box ir lygins su tab'o pavadinimu, kuris virsuje
        //Jei neatitis, ismes klaida
        // po to vel grizta ir raso is naujo naudojant for

    }
}

