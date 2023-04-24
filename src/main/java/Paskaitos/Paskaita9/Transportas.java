package Paskaitos.Paskaita9;

//Sukurkite klasę pavadinimu "Transportas" su savybėmis "marke", "modelis" ir "metai".
//        Sukurkite vaikinę klasę "Masina", kuri turi savybę "dureliuSkaicius".
//        Sukurkite dar vieną vaikinę klasę "SportineMasina", kuri turi savybę "didžiausiasGreitis".

public class Transportas {

    //apsirasome savybes
    String marke;
    String modelis;
    int metai;


    //apsirasome konstruktoriu
    public Transportas(String marke, String modelis, int metai) {
        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
    }

    //metodas
    public String getMarke() {
        return marke;
    }

    public String getModelis(){
        return modelis;
    }

    public int getMetai(){
        return metai;
    }
}


