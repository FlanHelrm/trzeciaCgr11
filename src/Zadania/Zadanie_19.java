import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie_19 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;
        int cookie = 48;
        double cukier_na_jedno = cukier / cookie;
        double maslo_na_jedno = maslo / cookie;
        double maka_na_jedno = maka / cookie;

        System.out.println("Podaj ile ciasteczek chcesz upiec: ");
        double cookie_ilosc = klawiatura.nextDouble();
        klawiatura.nextLine();

        double szklanka_cukier_na_jedno = cukier_na_jedno * cookie_ilosc;
        double szklanka_maslo_na_jedno = maslo_na_jedno * cookie_ilosc;
        double szklanka_maka_na_jedno = maka_na_jedno * cookie_ilosc;

        BigDecimal bd = new BigDecimal(szklanka_cukier_na_jedno).setScale(3, RoundingMode.HALF_UP);
        double szklanka_cukru_zaokraglona = bd.doubleValue();;
        BigDecimal bdd = new BigDecimal(szklanka_maslo_na_jedno).setScale(2, RoundingMode.HALF_UP);
        double szklanka_masla_zaokraglona = bdd.doubleValue();;
        BigDecimal bddd = new BigDecimal(szklanka_maka_na_jedno).setScale(2, RoundingMode.HALF_UP);
        double szklanka_maka_zaokraglona = bddd.doubleValue();;

        System.out.println("Potrzebujesz " +szklanka_cukru_zaokraglona + " szklanki cukru."
        + "\nPotrzebujesz " + szklanka_masla_zaokraglona + " szkanki masła."
        + "\nPotrzebujesz " + szklanka_maka_zaokraglona + " szklanki mąki.");


    }
}