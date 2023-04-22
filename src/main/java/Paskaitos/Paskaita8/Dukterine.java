package Paskaitos.Paskaita8;
//extends naudojame jei norime, kad paveldetu tevines klases savybes
public class Dukterine extends Tevine{
    private int galia;


    //reikia konstruktoriaus
    public Dukterine(int ratuSkaicius, int galia){
        //super paima ratu skaiciu
        //pasiimam sita savybe is tevines
        super(ratuSkaicius);
            this.galia = galia;
        }

    }

