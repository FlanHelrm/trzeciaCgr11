import java.util.Scanner;


public class Zadanie_10 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj wartość kupowanego produktu: ");
        double firstPrice = klawiatura.nextDouble();
        klawiatura.nextLine();

        double podatek_stanowy = 0.04;
        double podatek_lokalny = 0.02;
        double podatek_1_stanowy =  firstPrice * podatek_stanowy;
        double podatek_2_lokalny = firstPrice * podatek_lokalny;

        double price = firstPrice + podatek_1_stanowy + podatek_2_lokalny;

        System.out.println("Cena produktu wynosi: " + firstPrice
        + "\npodatek stanowy wynosi: " + podatek_1_stanowy
        + "\npodatek lokany wynosi: " + podatek_2_lokalny
        + "\nŁączna cena wynosi: " + price);


    }
}