package Paskaitos.Paskaita1;

public class Intro {
    //public reiskia, kad ta klase galima iskviesti ir kitose klasese.
    // galima bus pasiimti tuos metodus, kurie public kitoms klasems, o ne private

    //void -   sako, kad jus negrazinat jokiu reiksmiu
    public static void main(String[] args) {
        //susikuriame savybes
        String user = "Indre";

        //sout parasius ir paspaudus enter, sistema duos System.out.println
        System.out.println("Hello " + user);
        //Kintamuju tipai gali buti:
        //String tekstas = "laba diena"; string - naudojamas tekstui
        //int naudojamas skaiciui apibrezti
        // pvz: int number3 = 123;
        //boolean tipas - tam tikra salyga teisinga arba ne (true arba false)
        // pvz: Boolean numberIsEven = false;

        //uzduotis:
        //sudeti kelis kintamuosius ir sudauginti
        int a = 2;
        int b = 5;
        int suma = a + b;
        int sudauginti = a * b;

        System.out.println("sudetis: " + a + " + " + b + " = " + suma);
        System.out.println("daugyba: " + a + " * " + b + " = " + sudauginti);


    }
}
