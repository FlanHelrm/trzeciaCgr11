import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zadanie_21 {
    public static void main(String[] args) {

        int akcje = 1000;
        double cena = 32.87;
        double prowizja = 0.02;
        double cena_akcje = akcje * cena;
        double broker_przed = cena_akcje * prowizja;
        double cema_sprzedarz = 33.92;
        double cena_akcje_po = cema_sprzedarz * akcje;
        double broker_po = cena_akcje_po * prowizja;
        double cena_koncowa = cena_akcje_po -cena_akcje - broker_przed - broker_po;

        BigDecimal bd = new BigDecimal(cena_koncowa).setScale(2, RoundingMode.HALF_UP);
        double koniec = bd.doubleValue();;
        System.out.println("Jacek zapłacił za akcję: " + cena_akcje
        + " zł \nJacek zapłacił brokerowi przy zakupie: " + broker_przed
        + " zł \nJacek po sprzedarzy otrzymał " + cena_akcje_po
        + "zł \nJacek zapłacił brokerowi przy sprzedaży " + broker_po
        + "zł \nJacek po zapłaceniu obu prowizji posiada: " + koniec );
    }
}