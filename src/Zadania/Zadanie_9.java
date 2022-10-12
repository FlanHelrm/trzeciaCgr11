import java.util.Scanner;


public class Zadanie_9 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String firstName = klawiatura.nextLine();
        System.out.println("Podaj drugie imię: ");
        String middleName = klawiatura.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = klawiatura.nextLine();

        System.out.println("Imię: " + firstName
                + "\nDrugie imię: " + middleName
                + "\nNazwisko: " + lastName );

        char  firstInitial = firstName.charAt(0);
        char  middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Pierwszy inicjał " + firstInitial);
        System.out.println("Drugi inicjał " + middleInitial);
        System.out.println("Trzeci inicjał " + lastInitial);



    }
}