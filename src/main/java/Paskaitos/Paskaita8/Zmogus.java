package Paskaitos.Paskaita8;
//uzduotis
//Sukurkite klasę „Žmogus", kuri turi laukus vardas ir amžius. Sukurkite klasę „Studentas", kuri paveldi klasę „Žmogus"
// ir turi lauką universitetas.
public class Zmogus {

    //susikuriu kintamuosius
    //string, nes tekstine reiksme
    String vardas;
    //int nes skaitine reiksme
    int amzius;


    //susikuriame konstruktoriu
    //Zmogus - klases pavadinimas
    //skliaustuose rasome savo savybes apsirasytas
    public Zmogus(String vardas, int amzius) {
        //priskiriam vardo savybe vardui
        this.vardas = vardas;
        //priskiriame amzius savybe amziui
        this.amzius = amzius;

    }

    public String getVardas() {
        return vardas;
    }

    public int getAmzius(){
        return amzius;
    }


}
