package Paskaitos.Paskaita2;
import java.util.Scanner;

//paskaita apie Array

//uzduotis:
// parasyti programa, kuri paima visu sveiku skaiciu masyva ir grazins visu lyginiu skaiciu suma


public class Paskaita_2_Array_3 {

    public static void main(String[] args) {

        int[] masyvas = {1, 2, 8};
        int sum = 0;

        // : reiskia
        //Tai reiškia vieną dalyką - tai patobulintas for loop.
        // jei rasome taip: for (String i: words)
        // tai reiškia tą patį, ką ir
        //for (int i = 0; i < words.length; i++) {}
        //Pridėjimo priskyrimo operatorius += yra sutrumpintas būdas kintamajam pridėti reikšmę.
        // Kodas x+=y yra lygiavertis x=x+y.
        for (int value : masyvas) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        System.out.println("Suma: " + sum);
            }
        }








