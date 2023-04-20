package Paskaitos.Paskaita4;

public class Vaisiai {
    String vaisiausPavadinimas;
    int kalorijos;
    int kiekis;
    double kaina;

    //kad nerassyti visu savybiu, ir set, galime naudoti konstruktoriu
    //tai yra konstruktorius - musu set name, siuo atveju jo nebelieka
    //konstruktorius rasysime, kai nebus nei set nei get. Kai paveldesime tam tikras reiksmes, tuomet konstruktoriu naudosime
    // bet kolkas naudojame set ir get metodus, o ne konstruktorius
public Vaisiai (String vaisiausPavadinimas, int kalorijos, int kiekis, double kaina){
    this.vaisiausPavadinimas = vaisiausPavadinimas;
    this.kalorijos = kalorijos;
    this.kiekis = kiekis;
    this.kaina = kaina;

    //naudojant konstruktoriu is karto galime savo objekte rasyt skliaustuose
    //Vaisiai vaisius = new Vaisiai("Bananas",2.59,259,2);
}


    //susikuriame pagrindini metoda
    //be jo jokie metodai nepasileistu javoje. butent per ji galime matyti ka padarome apacioje
    public static void main(String[]args){

        Vaisiai vaisius = new Vaisiai("Bananas",259,2,2.59);
//        vaisius.setVaisiausPavadinimas("Bananas");
//        vaisius.setKaina(2.59);
//        vaisius.setKalorijos(259);
//        vaisius.setKiekis(2);

        System.out.println("Vaisiaus pavadinimas: " + vaisius.getVaisiausPavadinimas() + "\nKaina: " + vaisius.getKaina()
        + "\nKalorijos: " + vaisius.getKalorijos() + "\nKiekis: " + vaisius.getKiekis());


        if (vaisius.getKiekis() > 0){
            System.out.println("Cia yra " + vaisius.getKiekis() + " " + vaisius.getVaisiausPavadinimas());
        } else{
            System.out.println("kiekis yra mazesnis uz arba lygu 0");
        }

        //tai yra masyvas
        String[] vaisiai = {"Bananas", "obuolys", "vynuoges"};

        //kitas masyvo budas
        //automatiniame testavime bus naudinga, kai bus daug nuorodu. galima bus tas nuorodas idet i lista ir
        // issigryninti, be a tago

        String[] vaisiai1 = new String[3];
        vaisiai1[0] = "Bananas";
        vaisiai1[1] = "obuolys";
        vaisiai1[2] = "vynuoges";
        System.out.println(vaisiai1[2]);

        //parasyti for ir grazinti visa masyva
        for (int x = 0; x < vaisiai1.length; x++){
            //isprintiname masyva. x reikalingas, kad eitu per kiekviena elemetna
            System.out.println(vaisiai1[x]);
        }

        //isprintinti skaicius iki 10
        for (int i = 0; i < 11;i++){
            System.out.println(i);
        }
    }
    //susikuriame metodus. pasiekiame cia parametra, o ne objekta
    public void setVaisiausPavadinimas (String vaisiausPavadinimas){
        this.vaisiausPavadinimas = vaisiausPavadinimas;
    }

    public String getVaisiausPavadinimas(){
        return this.vaisiausPavadinimas;
    }

    public void setKalorijos (int kalorijos){
        this.kalorijos = kalorijos;
    }

    public  int getKalorijos(){
        return this.kalorijos;
    }

    public void setKiekis (int kiekis){
        this.kiekis = kiekis;
    }

    //getKiekis - metodo pavadinimas. skliaustuose nurodome ar yra argumentas ar ne
    public int getKiekis (){
        return this.kiekis;
    }

    public void setKaina (double kaina){
        this.kaina = kaina;
    }

    public double getKaina (){
        return this.kaina;
    }
}
