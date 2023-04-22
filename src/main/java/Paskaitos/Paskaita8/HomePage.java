package Paskaitos.Paskaita8;
import org.openqa.selenium.WebDriver;

//homepage paveldi basepage
public class HomePage extends BasePage{



//konstruktorius
    public  HomePage(WebDriver driver) {
        //super reikia, kad galetume panaudoti savybe
    super(driver);
        }


        //rasome metodus
    public void goTo(){
        driver.get("https://rde.lt");
    }
}
