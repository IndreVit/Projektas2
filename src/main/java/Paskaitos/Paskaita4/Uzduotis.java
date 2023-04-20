package Paskaitos.Paskaita4;

public class Uzduotis {
    public static void main(String[]args){
        //Turite skaičiu masyvą kuriame turite rasti lyginius ir nelyginius skaičius. Naudojami If ir for

        int[] skaiciai = {1, 9, 3, 5};
        //visada nuo false prasideda
        boolean radauLygini = false;

        for (int x = 0; x < skaiciai.length; x++){
            //dabar reikia patikrinti su if ar skaicius yra lyginis ar ne
            if (skaiciai[x] % 2 == 0){
                System.out.println(skaiciai[x]);
                //radau lygini, kuris lygus nebe false, o true
                //tai taip ir rasyt reikia, kad prilyginam true
                radauLygini = true;
//            } else{
//                System.out.println("Lyginiu skaiciu nerasta");
            }
            }//antra if reiketu rasyt po for. mums reikia vieno pranesimo
        //! prilygsta nelygu
        //if(radaulygini)= reiskias true
        if(!radauLygini){
            System.out.println("Lyginiu skaiciu nerasta");
        }
        }

    }
