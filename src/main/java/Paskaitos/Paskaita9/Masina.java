package Paskaitos.Paskaita9;

public class Masina extends Transportas{

    //savybe
    int dureliuSkaicius;

    //konstruktorius
    public Masina(String marke, String modelis, int metai, int dureliuSkaicius){
        //super paima savybes is paveldetos klases
        super(marke,modelis,metai);
        this.dureliuSkaicius = dureliuSkaicius;
    }


    //metodas
    public int getDureliuSkaicius(){
        return dureliuSkaicius;
    }
}

