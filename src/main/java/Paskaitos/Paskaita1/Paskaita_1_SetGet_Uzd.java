package Paskaitos.Paskaita1;

public class Paskaita_1_SetGet_Uzd {
    //susikuriame savybes
    String marke;
    String modelis;
    String spalva;


    public static void main(String[]args) {

        //susikuriame pbjektus
        Paskaita_1_SetGet_Uzd start1 = new Paskaita_1_SetGet_Uzd();
        start1.start();
        start1.setMarke("BMW");
        start1.setModelis("X5");
        start1.setSpalva("Balta");
        System.out.println("\nMasinos marke: " + start1.getMarke() + "\nMasinos modelis: " + start1.getModelis() +
                "\nMasinos spalva: " + start1.getSpalva());

        Paskaita_1_SetGet_Uzd drive1 = new Paskaita_1_SetGet_Uzd();
        drive1.drive();
        drive1.setMarke("Opel");
        drive1.setModelis("Insignia");
        drive1.setSpalva("Juoda");
        System.out.println("\nMasinos marke: " + drive1.getMarke() + "\nMasinos modelis: " + drive1.getModelis() +
                "\nMasinos spalva: " + drive1.getSpalva());

        Paskaita_1_SetGet_Uzd stop1 = new Paskaita_1_SetGet_Uzd();
        stop1.stop();
        stop1.setMarke("Ferrari");
        stop1.setModelis("F40");
        stop1.setSpalva("Raudona");
        System.out.println("\nMasinos marke: " + stop1.getMarke() + "\nMasinos modelis: " + stop1.getModelis() +
                "\nMasinos spalva: " + stop1.getSpalva());

        }





    //Metodu kurimas
    public String setMarke (String marke){
        this.marke = marke;
        return marke;
    }


    public String getMarke(){
        return this.marke;
    }

    //naudojant void nereikia return naudoti, nes pasako, kad nieko negrazinam
    public void setModelis (String modelis){
        this.modelis = modelis;
    }

    public String getModelis(){
        return this.modelis;
    }


    public void setSpalva (String spalva){
        this.spalva = spalva;
    }

    public String getSpalva(){
        return this.spalva;
    }



    public void start () {
        System.out.println("starting...");
    }

    public void drive () {
        System.out.println("driving...");
    }
    public void stop () {
        System.out.println("stopping...");
        //void rasomas, kai niekas negrazinama
    }
}
