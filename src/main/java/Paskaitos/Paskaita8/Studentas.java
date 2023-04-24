package Paskaitos.Paskaita8;
//uzduotis
//Sukurkite klasę „Žmogus", kuri turi laukus vardas ir amžius. Sukurkite klasę „Studentas", kuri paveldi klasę „Žmogus"
// ir turi lauką universitetas.

//su extends paveldime zmogus klases savybes
public class Studentas extends Zmogus {

    //susikuriame savybe universitetas
    String universitetas;

    //susikuriame konstruktoriu
    //skliaustuose apsirasome savybes is paveldetos klases ir dabartines
    public Studentas(String vardas, int amzius, String universitetas) {
        //super - leidzia pasiimti savybe
        //super paima savybes is paveldetos klases: amziu ir varda
        super(vardas, amzius);
        //priskiriame universitetas savybe universitetui
        this.universitetas = universitetas;
    }


    public String getUniversitetas (){
        return universitetas;
    }

//    public static void main (String[]args){
//        Studentas studentas = new Studentas("Petras",25,"ISM");
//        System.out.println("Vardas: " + studentas.getVardas() + "\nAmzius: " + studentas.getAmzius() + "\nUniversitetas: " + studentas.getUniversitetas());
//    }
}
