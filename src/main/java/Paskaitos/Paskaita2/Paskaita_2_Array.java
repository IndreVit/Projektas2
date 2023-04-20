package Paskaitos.Paskaita2;
//paskaita apie Array

public class Paskaita_2_Array {

    public static void main(String[]args) {

  //Masyvai naudojami kelioms reikšmėms saugoti viename kintamajame,
        // užuot kiekvienai reikšmei deklaravus atskirus kintamuosius.


//masyvai - sukuriame 5 skaicius nuo 1 iki 5
        //sukuriamas masyvas, kuriame yra 5 elementai
        //jei norime pasiekti pirma elementa, tai reiketu rasyt 0. [0] - tai yra indeksas,
        // vienas pvz kaip galime masyvus sukurti
        int[] masyvas = new int[5];
        masyvas[0] = 1;
        masyvas[1] = 2;
        masyvas[2] = 3;
        masyvas[3] = 4;
        masyvas[4] = 5;

        //nurodo kiek elementu yra masyve
       System.out.println(masyvas.length);
       

    }

}