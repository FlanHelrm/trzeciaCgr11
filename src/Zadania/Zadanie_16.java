import java.util.Scanner;

public class Zadanie_16 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cene posiłku: ");
        double cena = klawiatura.nextDouble();
        klawiatura.nextLine();
        double podatek = 0.0675;
        double napiwek = 0.20;

        double podatek_koncowy = podatek * cena;
        double cena_i_podatek = cena + podatek_koncowy;
        double napiwek_koncowy = napiwek * cena_i_podatek;
        double zaplata = cena + podatek_koncowy + napiwek_koncowy ;
        System.out.println("Cena posiłku: " + cena
        + "\nWartość podatku: "+ podatek_koncowy
        + "\nWysokość napiwku:" + napiwek_koncowy
        + "\nŁączna kwota: " + zaplata );
    }
}