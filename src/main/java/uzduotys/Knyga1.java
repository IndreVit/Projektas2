package uzduotys;
//mano sprendimas
//Sukurkite klasę Knyga, turinčią privačias savybes pavadinimas, autorius, isbn ir puslapiuSkaicius.
//        Klasė turi turėti set ir get metodus kiekvienai savybei.
//        Taip pat parašykite metodą arGeraKnyga(), kuris grąžintų true, jei knygos puslapių skaičius yra didesnis nei 200
//        ir false, jei ne.
public class Knyga1 {
    //Sukurkite klasę Knyga, turinčią privačias savybes pavadinimas, autorius, isbn ir puslapiuSkaicius.
    private String pavadinimas;
    private String autorius;
    private String isbn;
    private int puslapiuSkaicius;

    public static void main (String[]args) {
//objektu kurimas

        Knyga1 knyga1 = new Knyga1();
        knyga1.arGeraKnyga();
        knyga1.pavadinimas = "One by One";
        knyga1.autorius = "Chris Carter";
        knyga1.isbn = "978-3-16-148410-0";
        knyga1.puslapiuSkaicius = 305;

        if(knyga1.puslapiuSkaicius > 200){
            System.out.println(true + "\nKnygos pavadinimas: " + knyga1.pavadinimas + "\nKnygos autorius: "
                    + knyga1.autorius + "\nISBN: " + knyga1.isbn + "\nPuslapiu skaicius: " + knyga1.puslapiuSkaicius);
        } else {
            System.out.println(false + "\nKnygos pavadinimas: " + knyga1.pavadinimas + "\nKnygos autorius: "
                    + knyga1.autorius + "\nISBN: " + knyga1.isbn + "\nPuslapiu skaicius: " + knyga1.puslapiuSkaicius);
        }
    }


    // Klasė turi turėti set ir get metodus kiekvienai savybei.
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public String getPavadinimas() {
        return this.pavadinimas;
    }
    public void setAutorius (String autorius){
        this.autorius = autorius;
    }

    public String getAutorius(){
        return this.autorius;
    }

    public void setIsbn (String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setPuslapiuSkaicius (int puslapiuSkaicius){
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    public int getPuslapiuSkaicius(){
        return this.puslapiuSkaicius;
    }
    // Taip pat parašykite metodą arGeraKnyga(),
    // kuris grąžintų true, jei knygos puslapių skaičius yra didesnis nei 200, ir false, jei ne.

    public void arGeraKnyga(){
        System.out.println("Ar gera knyga? ");
    }
}
