import java.awt.*;
import java.util.Scanner;

public class Zadanie_17 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        int akcje = 600;
        double cena_akcje = 21.77;
        double prowizja = 0.02;
        double kwota_bez_prowizja = (double)akcje * cena_akcje;
        double broker = prowizja * kwota_bez_prowizja;
        double kwota_koncowa = broker + kwota_bez_prowizja;

        System.out.println("Kwota zapłacona za same akcje (bez prowizji): " + kwota_bez_prowizja
        + "\nWysokość prowizji: "+ broker
        + "\nŁączna zapłacona kwota (cena akcji plus prowizja): " + kwota_koncowa);
    }
}