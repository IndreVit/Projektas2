package Paskaitos.Paskaita1;

public class Paskaita_1_SetGet {

    String name;
    int age;
    String schoolName;

    //set - nustato ta reiksme
    // su get - gauna ta reiksme

    //viska ka kvieciam turi buti main metode
    public static void main(String[]args) {
        //sukuriame objekta
        Paskaita_1_SetGet myName = new Paskaita_1_SetGet();


        //parametro priskyrimas su reiksme taip ir metodo panaudojimas
        //Metodo kurimas
        myName.setName("Indre");
        //gauname reiksme
        String student1 = myName.getName();

        //metodo kurimas
        //priskiriame parametra su set
        Paskaita_1_SetGet myAge = new Paskaita_1_SetGet();
        myAge.setAge(99);
        //gauname reiksme
        int student2 = myAge.getAge();

        Paskaita_1_SetGet mySchoolName = new Paskaita_1_SetGet();
        mySchoolName.setSchoolName("blabla");
        String student3 = mySchoolName.getSchoolName();

        //spausdiname i konsole
        System.out.println("Mano vardas " + student1 + "\nMano amžius: " + student2 + "\nMano mokykla: " + student3);


    }
    //metodo kurimas
    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getName(){
        return this.name;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    public int getAge(){
        return this.age;
    }

    public String setSchoolName(String schoolName){
        this.schoolName = schoolName;
        return schoolName;
    }

    public String getSchoolName(){
        return this.schoolName;
    }

}

