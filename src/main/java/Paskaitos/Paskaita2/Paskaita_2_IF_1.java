package Paskaitos.Paskaita2;

import java.util.Scanner;
//Paskaita apie IF
// == reiskia lygu
//    // <= arba >= daugiau arba lygu
//    // != nelygu
public class Paskaita_2_IF_1 {
    public static void main(String[] args) {
// uzduotis:
// Sistema tikrins ar skaicius yra lyginis ar ne
        // Tam naudojame Scanner
        //ji leis konsoleje ivesti tam tikra skaiciu

        // susikuriame objekta Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //nextInt  - 	Reads a int value from the user
        int num = scanner.nextInt();
//jei padalinus is dvieju lygu nuliui tuomet lyginis
        //pirma salyga visada turi buti true
        // % - Operatorius, veikiantis su sveikaisiais skaičiais ir duodantis likutį, kai vienas skaičius dalijamas iš kito.
        // == - yra lygybės operatorius. Jis grąžina true, jei abu operandai nurodo tą patį objektą, priešingu atveju - false
        //siuo atveju tikrins ar skaicius dalinasi is dvieju be liekanos ir grazins true jei taip, false, jei ne
        if (num % 2 == 0) {
            System.out.println("lyginis");
        } else {
            System.out.println("nelyginis");
        }
    }
}