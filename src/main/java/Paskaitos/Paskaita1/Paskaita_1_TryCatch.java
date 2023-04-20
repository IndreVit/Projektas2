package Paskaitos.Paskaita1;

public class Paskaita_1_TryCatch {

    //Vykdant "Java" kodą gali atsirasti įvairių klaidų: programuotojo padarytų kodavimo klaidų, klaidų dėl neteisingos
    // įvesties ar kitų nenumatytų dalykų. Įvykus klaidai, "Java" paprastai sustoja ir pateikia klaidos pranešimą.
    // Techniškai tai vadinama: Šis termino pavadinimas reiškia, kad "Java" išmeta išimtį (meta klaidą).
    //Naudodami "try" komandą galite apibrėžti kodo bloką, kuris bus tikrinamas, ar nėra klaidų, kol bus vykdomas.
    //Užrašas catch leidžia apibrėžti kodo bloką, kuris bus vykdomas, jei try bloke įvyks klaida.

    public static void main(String[]args) {

        //susikuriame array
        try {
            int[] myNumbers = {1, 2, 3, 5, 7};
            //prasome, kad grazintu 4 reiksme musu array. siuo atveju grazins  7, nes skaiciuojasi nuo 0
            System.out.println(myNumbers[4]);
            //prasome, kad grazintu 10 reiksme musu array. siuo atveju mes klaida, nes array nera tiek reiksmiu
            System.out.println(myNumbers[10]);
            //jei neranda tokios reiksmes, tuomet ismes error
        } catch (Exception e) {
            System.out.println("tokios reiksmes nera");
        }
    }
}
