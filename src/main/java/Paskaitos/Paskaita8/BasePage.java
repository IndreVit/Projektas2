package Paskaitos.Paskaita8;

import org.openqa.selenium.WebDriver;

public class BasePage {
    //apsirasysim driveri basepage ir mums nebereikes pernaudot jo
    //turim driveri

    protected WebDriver driver;

    //konstruktorius
    public BasePage(WebDriver driver){
        //priskiram driveri driveriui
        this.driver = driver;
        //isdidins langa
        driver.manage().window().maximize();
    }
}
