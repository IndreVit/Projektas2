package Paskaitos.Paskaita9;

import java.sql.SQLOutput;

public class SportineMasina extends Masina {

    //savybe
    int didziausiasGreitis;

    //konstruktorius
    public SportineMasina (String marke, String modelis, int metai, int dureliuSkaicius, int didziausiasGreitis) {
    super(marke,modelis,metai,dureliuSkaicius);
    this.didziausiasGreitis = didziausiasGreitis;
    }

    //metodas

    public int getDidziausiasGreitis() {
        return didziausiasGreitis;
    }

//    main metodas
//    public static void main(String[]args){
//        //objektas
//        SportineMasina masina = new SportineMasina("Ferrari","F4",2015,4,250);
//
//    }



}



