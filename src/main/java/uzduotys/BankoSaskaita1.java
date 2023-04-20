package uzduotys;
//mano sprendimas
//Sukurkite klasę BankoSaskaita, turinčią privačias savybes saskaitosNumeris, savininkoVardas, balansas ir limitas.
//        Klasė turi turėti set ir get metodus kiekvienai savybei.
//        Taip pat parašykite metodą papildytiBalansa(double suma), kuris padidintų balansą nurodyta suma,
//        ir metodą siustiPinigus(BankoSaskaita kitasSaskaita, double suma), kuris pervestų pinigus į kitą sąskaitą,
//        tačiau tik tada, jei balansas yra didesnis už sumą.
public class BankoSaskaita1 {
    String saskaitosNumeris;
    String savininkoVardas;
    int balansas;
    int limitas;

    public static void main (String[]args){

        //objekto 1 kurimas
        BankoSaskaita1 balansas1 = new BankoSaskaita1();
        balansas1.PapildytiBalansa();
        balansas1.saskaitosNumeris = ("LT12345");
        balansas1.savininkoVardas = ("Indre");
        balansas1.balansas = (100);
        balansas1.limitas = (200);
        int a = 50;
        int balansoDidinimas = a + balansas1.balansas;


        System.out.println("Saskaitos numeris: " + balansas1.saskaitosNumeris + "\nSavininko vardas: " +
                balansas1.savininkoVardas + "\nEsamas balansas: " + balansas1.balansas + "\nPadidinti balansa sia suma: "
                + a + "\nNauja balanso suma: " + balansoDidinimas);

        BankoSaskaita1 pinigai = new BankoSaskaita1();
        pinigai.SiustiPinigus();
        pinigai.saskaitosNumeris = ("LT2222");
        pinigai.savininkoVardas = ("Indre");
        pinigai.balansas = (125);
        pinigai.limitas = (200);
        String kitaSaskaita = "LT5555";
        int suma = 250;

        if (pinigai.balansas > suma) {
            System.out.println("Saskaitos numeris: " + pinigai.saskaitosNumeris + "\nSavininko vardas: " +
                    pinigai.savininkoVardas + "\nSaskaitos numeris i kuria pervesti: " + kitaSaskaita +
                    "\nBalansas: " + pinigai.balansas + "\nPervedama suma: " + suma + "\nSuma sekmingai pervesta");
        } else {
            System.out.println("Saskaitos numeris: " + pinigai.saskaitosNumeris + "\nSavininko vardas: " +
                    pinigai.savininkoVardas + "\nSaskaitos numeris i kuria pervesti: " + kitaSaskaita +
                    "\nBalansas: " + pinigai.balansas + "\nPervedama suma: " + suma + "\nPavedimo ivykdyti negalima, " +
                    "suma didesne nei esamas balansas");
        }

    }



    // Klasė turi turėti set ir get metodus kiekvienai savybei.
    public void setSaskaitosNumeris (String saskaitosNumeris){
        this.saskaitosNumeris = saskaitosNumeris;
    }

    public String getSaskaitosNumeris(){
        return this.saskaitosNumeris;
    }

    public void setSavininkoVardas (String savininkoVardas){
        this.savininkoVardas = savininkoVardas;
    }

    public String getSavininkoVardas(){
        return this.savininkoVardas;
    }

    public void setBalansas (int balansas){
        this.balansas = balansas;
    }

    public int getBalansas(){
        return this.balansas;
    }

    public void setLimitas (int limitas){
        this.limitas = limitas;
    }

    public int getLimitas(){
        return this.limitas;
    }
    // Taip pat parašykite metodą papildytiBalansa(double suma), kuris padidintų balansą nurodyta suma, ir metodą
    // siustiPinigus(BankoSaskaita kitasSaskaita, double suma), kuris pervestų pinigus į kitą sąskaitą, tačiau tik tada,
    // jei balansas yra didesnis už sumą.

    public void PapildytiBalansa () {
        System.out.println("Padidinti balansa nurodyta suma");
    }
    public void SiustiPinigus (){
        System.out.println("\nSiusti pinigus");
    }
}
