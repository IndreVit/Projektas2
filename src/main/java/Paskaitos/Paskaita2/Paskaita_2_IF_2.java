package Paskaitos.Paskaita2;
//paskaita apie if
import java.util.Scanner;

public class Paskaita_2_IF_2 {

        public static void main(String[] args) {
// uzduotis:
// Sistema tikrins ar asmuo nurodes amziu yra pilnametis ar ne
// Tam naudojame Scanner
// ji leis konsoleje ivesti tam tikra skaiciu
//
// susikuriame objekta Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            //nextInt  - 	Reads a int value from the user
            int num = scanner.nextInt();
//jei irasytas skaicius daugiau arba lygu 18, tuomet pilnametis
            if (num >= 18) {
                System.out.println("Pilnametis");
            } else {
                System.out.println("Nepilnametis");
            }
        }
    }

