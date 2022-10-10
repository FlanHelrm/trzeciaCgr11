public class Zadanie_5_6 {
    public static void main(String[] args) {
        int pokoj1_wymiar1 = 3;
        int pokoj1_wymiar2 = 4;

        int pokoj2_wymiar1 = 2;
        int pokoj2_wymiar2 = 3;

        int pokoj3_wymiar1 = 2;
        int pokoj3_wymiar2 = 2;

        int pokoj4_wymiar1 = 3;
        int pokoj4_wymiar2 = 4;

        int pokoj_1 = (pokoj1_wymiar1 * pokoj1_wymiar2);
        int pokoj_2 = pokoj2_wymiar1 * pokoj2_wymiar2;
        int pokoj_3 = pokoj3_wymiar1 * pokoj3_wymiar2;
        int pokoj_4 = pokoj4_wymiar1 * pokoj4_wymiar2;

        int powierzchnia = pokoj_1 + pokoj_2 + pokoj_3 + pokoj_4;


        System.out.println("Powierzchnia pokoj 1  wynosi: "+ pokoj_1);
        System.out.println("Powierzchnia pokoj 2 wynosi: "+ pokoj_2);
        System.out.println("Powierzchnia pokoj 3 wynosi: "+ pokoj_3);
        System.out.println("Powierzchnia pokoj 4 wynosi: "+ pokoj_4);
        System.out.println("Powierzchnia calkowita: "+ powierzchnia);
        double metr_osoba;
        int osoby = 4;

        metr_osoba = (double) powierzchnia / osoby;
        System.out.println("Na jedna osobe przypada: "+metr_osoba);







    }
}
