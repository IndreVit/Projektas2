package Paskaitos.Paskaita9;

//Sukurkite klasę pavadinimu "Transportas" su savybėmis "marke", "modelis" ir "metai".
//        Sukurkite vaikinę klasę "Masina", kuri turi savybę "dureliuSkaicius".
//        Sukurkite dar vieną vaikinę klasę "SportineMasina", kuri turi savybę "didžiausiasGreitis".

public class Transportas {

    //apsirasome savybes
    //savybes apsirasome kaip private
    private static String marke;
   private static String modelis;
   private static int metai;


    //apsirasome konstruktoriu
    public Transportas(String marke, String modelis, int metai) {
        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
    }

    //metodas
    public static String getMarke() {
        return marke;
    }

    public static String getModelis(){
        return modelis;
    }

    public static int getMetai(){
        return metai;
    }
}


