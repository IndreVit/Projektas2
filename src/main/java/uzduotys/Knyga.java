package uzduotys;
//destytojo atsakymas
//Sukurkite klasę Knyga, turinčią privačias savybes pavadinimas, autorius, isbn ir puslapiuSkaicius.
//        Klasė turi turėti set ir get metodus kiekvienai savybei.
//        Taip pat parašykite metodą arGeraKnyga(), kuris grąžintų true, jei knygos puslapių skaičius yra didesnis nei 200
//        ir false, jei ne.

public class Knyga {
    //susikuriame privacias savybes
        private String pavadinimas;
        private String autorius;
        private String isbn;
        private int puslapiuSkaicius;

        //pasirasome metodus kiekvienai savybei
        public String getPavadinimas() {
            return pavadinimas;
        }

        public void setPavadinimas(String pavadinimas) {
            this.pavadinimas = pavadinimas;
        }

        public String getAutorius() {
            return autorius;
        }

        public void setAutorius(String autorius) {
            this.autorius = autorius;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public int getPuslapiuSkaicius() {
            return puslapiuSkaicius;
        }

        public void setPuslapiuSkaicius(int puslapiuSkaicius) {
            this.puslapiuSkaicius = puslapiuSkaicius;
        }
//pasirasome metoda arGeraKnyga, kuri grazina true, jei puslapiu skaicius daugiau nei 200 ir fal, jei maziau
    //kadangi reikia true ar false, tai naudojame boolean
    //pirma boolean reiksme yra true
        public boolean arGeraKnyga() {
            return puslapiuSkaicius > 200;
        }
//susikuriame objektus
        public static void main(String[] args) {
            Knyga knyga = new Knyga();
            knyga.setPavadinimas("Java programavimas");
            knyga.setAutorius("John Smith");
            knyga.setIsbn("978-609-456-789-4");
            knyga.setPuslapiuSkaicius(300);

            System.out.println("Knyga: " + knyga.getPavadinimas());
            System.out.println("Autorius: " + knyga.getAutorius());
            System.out.println("ISBN: " + knyga.getIsbn());
            System.out.println("Puslapių skaičius: " + knyga.getPuslapiuSkaicius());
            System.out.println("Ar gera knyga? " + knyga.arGeraKnyga());
        }
    }

