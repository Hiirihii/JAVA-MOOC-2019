
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        int[] luvut = {3, -1, 8, 4};

        System.out.println(summa(luvut, 0, 0, 0, 0));
        System.out.println(summa(luvut, 0, 0, 0, 10));
        System.out.println(summa(luvut, 0, 1, 0, 10));
        System.out.println(summa(luvut, 0, 1, -10, 10));
        System.out.println(summa(luvut, -1, 999, -10, 10));

    }

    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        int alku = mista;
        int loppu = mihin;
        int summa = 0;

        if (mista < 0) {
            alku = 0;
        }

        if (loppu > taulukko.length - 1) {
            loppu = taulukko.length - 1;
        }

        for (int i = alku; i <= loppu; i++) {
            
            if (taulukko[i] >= pienin && taulukko[i] <= suurin) {
                summa = summa + taulukko[i];
           
            }
  
           

        }
        return summa;
    }

}
