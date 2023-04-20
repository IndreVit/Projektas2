package Paskaitos.Paskaita2;
//paskaita apie Array

public class Paskaita_2_ForLoop_1 {

    public static void main(String[] args) {
        //neteisingai parasius for tai eis iki begalybes ir nesustos paleistas darbas


        //Uzduotis:
        // isspausdinti 100 skaiciu tik pirminius skaicius


        //sprendimas:
        //i = 1 nurodo, kad prades nuo 1 ir tikrinks kiekviena skaiciu iki 100
        //i<100 - nurodo, kad tikrins tik 100 skaiciu, tai kadangi pradedam nuo 1, tai iki 100 tikrins
        //i++ reiskia inkrementuojam ir pridedam po 1
        // jei rasytume i--, tuomet atimtu po viena

        for (int i = 1; i < 100; i++) {
            //jei dalijasi is 1 arba pacio saves, tai pirminis bus, todel tam reikalingas boolean
            //isPrime musu objektas
            boolean isPrime = true;
            //cia tikriname nuo 2
            //tikrina ar dalinasi is saves ir is 1, reiskias yra pirminis
            for (int j = 2; j < i; j++) {
                // i % j == 0 - tikriname ar i dalijasi is j be liekanos. siuo atveju ar 1 dalijasi is 2 be liekanos


                if (i % j == 0) {
                    isPrime = false;
                }

                //juos lyginame veliau

                //tuomet lyginame ar isPrime ir i daugiau uz 1
                // && reiksme Returns true if both statements are true
                // jei taip, tuomet grazins visus pirminius skaicius
            }
            if (isPrime && i > 1) {
                System.out.println(i + "");
            }
        }
    }
}
