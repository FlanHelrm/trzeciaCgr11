import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie_20 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj kwote pieniędzy początkowo zdeponowanej na koncie: ");
        double P = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Podaj roczną stopę oprocentowania: ");
        double r = klawiatura.nextDouble();
        klawiatura.nextLine();
        int sto = 100;
        double r_po = r/sto;
        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane: ");
        double n = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Podaj liczbę lat, przez jakie środki będą znajdować się na koncie i generować odsetki:  ");
        double t = klawiatura.nextDouble();
        klawiatura.nextLine();
        double nt= n*t ;
        double A, B, C;
        B = P*(1+r_po/n);
        C = Math.pow(B,nt);
        A = B;
        BigDecimal bd = new BigDecimal(A).setScale(0, RoundingMode.HALF_UP);
        double A_zaokraglona = bd.doubleValue();;
        System.out.println("Po " + t + " latach, na koncie będziesz posiadać " + A_zaokraglona + " zł." + B);
    }
}