import java.util.Scanner;

public class Zadanie_15 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ulubione miasto:  ");
        String miasto = klawiatura.nextLine();

        int liczba = miasto.length();
        String litery_up = miasto.toUpperCase();
        String litery_down = miasto.toLowerCase();
        char znak = miasto.charAt(0);
                System.out.println("Miasto :" + miasto
                + "\nDuże litery: " + litery_up
                + "\nMałe litery: " + litery_down
                + "\nPierwsza liczba: " +znak);
    }
}