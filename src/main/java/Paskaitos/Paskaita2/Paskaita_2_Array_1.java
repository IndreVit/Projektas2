package Paskaitos.Paskaita2;
//paskaita apie Array

public class Paskaita_2_Array_1 {

    public static void main(String[] args) {

        //Masyvai naudojami kelioms reikšmėms saugoti viename kintamajame,
        // užuot kiekvienai reikšmei deklaravus atskirus kintamuosius.


        // dar vienas pvz kaip galime masyvus sukurti


        //sukuriamas masyvas
        int[] masyvas = {1, 5, 6};
        //istrintina 2 masyva. Kadangi masyvai indeksuojasi nuo 0, tai atsakymas bus 6
        System.out.println(masyvas[2]);

        //nurodo kiek masyve yra elementu, siuo atveju bus trys
        System.out.println(masyvas.length);

        //i=0 - pradedama nuo nulio
        //i<masyvas.length kadangi masyve yra 3 reiksmes, tai isprintis tik 3 reiskmes 0,1,2
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(i);

        }

    }
}

//uzduotis:
// parasyti programa, kuri paima visu sveiku skaiciu masyva ir grazins visu lyginiu skaiciu suma
