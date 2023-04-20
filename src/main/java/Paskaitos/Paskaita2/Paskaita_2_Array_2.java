package Paskaitos.Paskaita2;
import java.util.Scanner;

//paskaita apie Array

//uzduotis:
// parasyti programa, kuri paima visu sveiku skaiciu masyva ir grazins visu lyginiu skaiciu suma


public class Paskaita_2_Array_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // nustatome array elementu skaiciu
        System.out.println("Iveskite masyvo elementu skaiciu: ");
        int size = in.nextInt();
        int[] array = new int[size];
        int sum = 0;

        // ivedame masyvo skaicius
        System.out.println("Iveskite masyvo skaicius: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }


        // kai turime visa array, galime gauti lyginiu skaiciu suma
        // : reiskia
        //Tai reiškia vieną dalyką - tai patobulintas for loop.
        // jei rasome taip: for (String i: words)
        // tai reiškia tą patį, ką ir
        //for (int i = 0; i < words.length; i++) {}
        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        System.out.println("Suma: " + sum);
    }
}






