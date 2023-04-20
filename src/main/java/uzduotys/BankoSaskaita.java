package uzduotys;

import java.sql.SQLOutput;


//Sukurkite klasę BankoSaskaita, turinčią privačias savybes saskaitosNumeris, savininkoVardas, balansas ir limitas.
//        Klasė turi turėti set ir get metodus kiekvienai savybei.
//        Taip pat parašykite metodą papildytiBalansa(double suma), kuris padidintų balansą nurodyta suma,
//        ir metodą siustiPinigus(BankoSaskaita kitasSaskaita, double suma), kuris pervestų pinigus į kitą sąskaitą,
//        tačiau tik tada, jei balansas yra didesnis už sumą.
public class BankoSaskaita {
    //susikuriame privacias savybes
    //"Java" raktažodis double yra primityvus duomenų tipas. Tai dvigubo tikslumo 64 bitų IEEE 754 slankiojo kablelio
    // tipas. Jis naudojamas kintamiesiems ir metodams deklaruoti. Paprastai juo žymimi dešimtainiai skaičiai.
    // double aprasymas su pvz:https://www.w3schools.com/java/ref_keyword_double.asp
    //siuo atveju double naudojamas, nes balansas ir limitas gali buti desimtainiai skaiciai
    private String saskaitosNumeris;
    private String savininkoVardas;
    private double balansas;
    private double limitas;

    //susikuriame objektus
    public static void main(String[] args) {
        BankoSaskaita bankas = new BankoSaskaita();
        bankas.setBalansas(500);
        bankas.setSaskaitosNumeris("LT15422");
        bankas.setSavininkoVardas("Indre");
        bankas.setLimitas(3000);



        System.out.println("Savininko vardas: " + bankas.getSavininkoVardas());
        System.out.println("Saskaitos nr: " + bankas.getSaskaitosNumeris());
        System.out.println("Limitas: " + bankas.getLimitas());
        System.out.println("Balansas: " + bankas.getBalansas());
        // System.out.println("Papildyti balansa: " + bankas.papildytiBalansa());
        // System.out.println("Siusti pinigus: " + bankas.siustiPinigus());
        bankas.papildytiBalansa(600);
        System.out.println("Naujas balansas: " + bankas.getBalansas());
        //bankas.siustiPinigus( "LT123",35.25);
        //System.out.println("Balansas po pervedimo: " + bankas.getBalansas());

    }

    //susikuriame metodus kiekvienai savybei
    public void setSaskaitosNumeris(String saskaitosNumeris) {
        this.saskaitosNumeris = saskaitosNumeris;
    }

    public String getSaskaitosNumeris() {
        return this.saskaitosNumeris;
    }

    public void setSavininkoVardas(String savininkoVardas) {
        this.savininkoVardas = savininkoVardas;
    }

    public String getSavininkoVardas() {
        return this.savininkoVardas;
    }

    public void setBalansas(double balansas) {
        this.balansas = balansas;
    }

    public double getBalansas() {
        return this.balansas;
    }

    public void setLimitas(double limitas) {
        this.limitas = limitas;
    }

    public double getLimitas() {
        return this.limitas;
    }

    //susikuriame metoda papildytiBalansa
    // operatorius += yra tas pats kas balansas + suma
//    "suma" yra perduodamas kaip argumentas metodui, ir jis yra naudojamas, kad būtų padidintas "balansas".
//
//  this yra nuoroda į objektą, kurio metodas yra naudojamas.
//  Tai reiškia, kad this rodo į tą patį objektą, kuriame yra saugomos savybės balansas,saskaitosNumeris,
//  savininkoVardas ir limitas.
//  balansas yra savybė, kurią mes norime padidinti.
//  += yra sutrumpinimas operatorius, kuris prideda reikšmę prie kintamojo ir priskiria rezultatą tam pačiam kintamajam. Tai yra tas pats dalykas kaip ir this.balansas = this.balansas + suma;.
//  suma yra argumentas, kuris yra paduodamas į papildytiBalansa metodą.
//  Tai yra reikšmė, kuri yra pridedama prie balansas savybės, kad būtų padidintas sąskaitos balansas.
    public void papildytiBalansa(double suma) {
        this.balansas += suma;
    }

    //susikuriame metoda siustiPinigus
//naudojame boolean ir jei balansas maziau uz suma, tuomet pervesti pinigu negali ir grazina false
    //kitu atveju balansa atima is sumos ir grazina true
    public boolean siustiPinigus(BankoSaskaita kitasSaskaita, double suma) {
        if (this.balansas < suma) {
            return false;
        }
        this.balansas -= suma;
        kitasSaskaita.papildytiBalansa(suma);
        return true;
    }


}


