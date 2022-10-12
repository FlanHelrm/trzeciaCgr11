import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zadanie_18 {
    public static void main(String[] args) {
        int konsumenci = 12467;
        double energetyk = 0.14 ;
        double energetyk_cytrusowy = 0.64;
        double energetyk_tygodniowo =  konsumenci * energetyk;
        double energetyk_cytrusowy_tygodniowo = konsumenci * energetyk_cytrusowy;
        BigDecimal bd = new BigDecimal(energetyk_tygodniowo).setScale(0, RoundingMode.HALF_UP);
        double zaokraglona_energetyk_tygodniowo = bd.doubleValue();;
        BigDecimal bdd = new BigDecimal(energetyk_cytrusowy_tygodniowo).setScale(0, RoundingMode.HALF_UP);
        double zaokraglona_energetyk_cytrusowy_tygodniowo = bdd.doubleValue();;

        System.out.println("Przybliżona liczba ankietowanych osób, które kupują przynajmniej jeden napój energetyczny tygodniowo: " + zaokraglona_energetyk_tygodniowo
        + "\nPrzybliżona liczba ankietowanych osób, które preferują napoje energetyczne o smaku cytrusowym: " +  zaokraglona_energetyk_cytrusowy_tygodniowo);



    }
}