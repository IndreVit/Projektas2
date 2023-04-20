package Paskaitos.Paskaita5;
import java.util.Scanner;
//Mes turime sąrašą kuriame yra produktai ["manoPRoduktas1","manoProduktas2"]
// ir tuomet leidžiate pridėti vartotojui papildomą produktą į tą sąrašą.
public class Paskaita5_uzduotis3 {
    public static void main(String[]args){
        //sukuriamas objektas
        Paskaita5_uzduotis3 testingArray = new Paskaita5_uzduotis3();
        testingArray.createArray();
    }
//sukuriamas metodas
    public void createArray(){
        //metode kuriamas masyvas
        String[] fruits = {"Orange","Apple"};
        //naudojamas scanneris, kuris leidzia konsoleje ivesti reiksme
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fruit: ");
        String item = scan.nextLine();

        //naujas masyvas
        String[] newItems = new String[fruits.length + 1];
        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equals(item)){
                System.out.println("Error: fruit already exists in the list");
                return;
            }
            newItems[i] = fruits[i];
        }
        newItems[fruits.length] = item;
        for (String newItem : newItems) {
            System.out.println(newItem);
        }
    }
    }


