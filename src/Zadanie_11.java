import java.util.Scanner;


public class Zadanie_11 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe przejechanych kilometrów: ");
        double przejechane_kilometry = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj liczbe zużytych litrów paliwa: ");
        double litry_paliwa = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kilometry_na_litrze = przejechane_kilometry / litry_paliwa;
        System.out.println("Liczba kilometrów przejechanych na litrze wynosi: "
                + kilometry_na_litrze + " km ");
    }
}