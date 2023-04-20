package Paskaitos.Paskaita4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NamuDarbai {
    public static void main(String[]args){
        //Užduotis:
        //Suskaičiuokite masyvo elementus, kurie yra didesni už 10.

        //susikuriu masyva
        int[] masyvas = {2,25,6,105,45};
        //susikuriu kintamaji, kuris lygus 0
        // Kintamasis, kuris saugos elementų skaičių
        int suma = 0;

        //tam, kad suskaiciuociau man reikia, kad pereitu per visus skaicius. Naudoju for ir if
        for (int x=0; x<masyvas.length; x++){
            //jei skaicius daugiau uz 10, tuomet ji pridedu prie savo susikurto sumos kintamojo
            if(masyvas[x] > 10){
                //// Jei elementas yra didesnis už 10, padidiname kintamąjį vienetu

                suma ++;

            }
        }
        //noriu atvaizduoti suma skaiciu, kurie daugiau uz 10
        System.out.println("1 uzd: " + "\nsuma: " + suma);


        //2. Užduotis:
        //Suraskite masyvo elementą su didžiausia reikšme.


    // priskirti pirmąjį masyvo elementą kaip didžiausią reikšmę
        int max = masyvas[0];

        for(int i=0; i < masyvas.length; i++){
            // Peržiūrėkite masyvo elementus iš antrojo ir
            // palyginkite kiekvieną elementą su dabartiniu max
            //tikrinu ar mano max reiksme yra maziau nei masyvo reiksme. Jei taip, tuomet ta reiksme priskiriu prie
            //susikurto max elemento. Ir taip ratu eina del for, kol randa max reiksme
            if (max < masyvas[i]){
                max = masyvas[i];
            }
        }
        System.out.println("2 uzduotis: "+ "\nmaksimali masyvo reiksme: " + max);

        //3. Užduotis:
        //Pakeiskite masyvo 3 elementą su nauja reikšme.

        //isprintinu savo daabrtine reiksme
        System.out.println("Trecia uzd: " + "\ntrecia masyvo reikšme pries pakeitima: " + masyvas[2]);
        //savo masyvui pakeiciu 3 elementa i nauja reiksme, kuri lygi 0
        masyvas[2] = 100;
        //isprintinu nauja masyvo reiksme
        System.out.println("Antra masyvo reiksme po pakeitimo: " + masyvas[2]);

        //4. Užduotis:
        //Sukurkite masyvą, kuris saugo 7 skirtingas temperatūras.
        // Naudodami "set" metodą, pakeiskite temperatūrą, kuri yra 4-toje masyvo pozicijoje.
        // Jei temperatūra yra žemesnė nei 0, spausdinkite pranešimą "Šalta".
        //Jei temperatūra yra aukštesnė nei 25, spausdinkite pranešimą "Karšta".

        //// Creating object of ArrayList<Integer>
        ArrayList <Integer> temperatura = new ArrayList<Integer>();

        //pridedame i objekta reiksmiu
        temperatura.add(-20);
        temperatura.add(-15);
        temperatura.add(-10);
        temperatura.add(0);
        temperatura.add(5);
        temperatura.add(30);
        temperatura.add(45);

        //int[] temperatura = {-20, -15, -10, 0, 5, 30, 45};

        //gaunu dabartine reiksme, kuri yra ketvirta
        System.out.println("4 uzd: " + "\nDabartine temperatura 4 vietoje: " + temperatura.get(3));
        //The set(int index, E element) method takes two parameters,
        // the first is the index of an element you want to replace,
        // and the second is the new value you want to insert.
        //
        //3 - nurodau indeksa
        //15 nurodau nauja reiksme
        temperatura.set(3, 15);

        //noriu, kad man grazintu 3 indekso reiksme
        System.out.println("Nauja temperaturos reiksme: " + temperatura.get(3));
//size parodo kiek elementu yra arraylist'e
        for(int y=0; y < temperatura.size(); y++){
            //tikrinam ar arraylist'o reiksmes yra maziau nei 0
            if(temperatura.get(y) < 0){
                System.out.println("Šalta");

            } else if(temperatura.get(y) > 25 ){
                System.out.println("karšta");
            }
        }




        //5. Užduotis:
        //Sukurkite programą, kuri leidžia vartotojui įvesti savo amžių ir tada atspausdina pranešimą,
        // ar jis pilnametis ir gali balsuoti.

        //reikia naudoti scanner, kad galima butu ivesti reiksme
        //susikuriu objekta amzius
        Scanner amzius = new Scanner(System.in);
        //isprintinu pavadinima, ka reikia padaryti
        System.out.println("Iveskite savo amziu: ");
        //nextInt  - 	Reads a int value from the user
        int amzius1 = amzius.nextInt();
        //jei amzius daugiau arba lygu 18, tuomet gali balsuoti
        if (amzius1 >= 18) {
            System.out.println("Pilnametis, balsuoti galima");
        } else {
            System.out.println("Nepilnametis, balsuoti negalima");
        }

        //6. Užduotis:
        //Parašykite programą, kuri atspausdina žodžius "Automatinis testavimas su JAVA" 10 kartų.

        //pasirasau for, kad kiekviena karta eitu sistema is naujo 10 kartu ir grazintu norima teksta
        for(int g = 0; g < 10; g++){
            System.out.println("Automatinis testavimas su JAVA");
        }
    }
}
