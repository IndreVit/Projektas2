package Paskaitos.Paskaita4;

//Sukurkite masyvą, kuris saugo 7 skirtingas temperatūras. Naudodami "set" metodą, pakeiskite temperatūrą,
// kuri yra 4-toje masyvo pozicijoje. Jei temperatūra yra žemesnė nei 0, spausdinkite pranešimą "Šalta".
//Jei temperatūra yra aukštesnė nei 25, spausdinkite pranešimą "Karšta".

public class Uzduotis_4 {
        private int[] temperatures;

        public Uzduotis_4(int[] temperatures) {
            this.temperatures = temperatures;
        }
        public static void main(String[] args) {
            int[] temperatures = {10, 15, 20, -5, 12, 27, 23};
            Uzduotis_4 temp = new Uzduotis_4(temperatures);

            System.out.println(temp.getTemperature(3)); // Spausdina: -5
            temp.setTemperature(3, 5); // Spausdina: Šalta
            System.out.println(temp.getTemperature(3)); // Spausdina: 5
        }
        public int getTemperature(int index) {
            if (index >= 0 && index < temperatures.length) {
                return temperatures[index];
            } else {
                System.out.println("Indeksas nepriimtinas.");
                return -1;
            }
        }

        public void setTemperature(int index, int value) {
            if (index >= 0 && index < temperatures.length) {
                temperatures[index] = value;
                if (value < 0) {
                    System.out.println("Šalta");
                } else if (value > 25) {
                    System.out.println("Karšta");
                }
            } else {
                System.out.println("Indeksas nepriimtinas."); //pridėkime tikrinimą, ar indeksas nurodytas tinkamai.
            }
        }
    }

