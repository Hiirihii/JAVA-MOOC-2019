
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        Lista<String> lista = new Lista<>();
        Hajautustaulu<String, String> taulu = new Hajautustaulu<>();

        for (int i = 0; i < 1000000; i++) {
            lista.lisaa("" + i);
            taulu.lisaa("" + i, "" + i);
        }

        Lista<String> haettavat = new Lista<>();
        Random arpoja = new Random();
        for (int i = 0; i < 1000; i++) {
            haettavat.lisaa("" + arpoja.nextInt(2000000));
        }

        long listanHakuAloitus = System.nanoTime();
        for (int i = 0; i < haettavat.koko(); i++) {
            lista.sisaltaa(haettavat.arvo(i));
        }
        long listanHakuLopetus = System.nanoTime();

        long hajautustaulunHakuAloitus = System.nanoTime();
        for (int i = 0; i < haettavat.koko(); i++) {
            taulu.hae(haettavat.arvo(i));
        }
        long hajautustaulunHakuLopetus = System.nanoTime();

        long listanHaku = listanHakuLopetus - listanHakuAloitus;
        System.out.println("Lista: haku kesti noin " + listanHaku / 1000000 + " millisekuntia ("
                + listanHaku + " nanosekuntia.)");

        long hajautustaulunHaku = hajautustaulunHakuLopetus - hajautustaulunHakuAloitus;
        System.out.println("Hajautustaulu: haku kesti noin " + hajautustaulunHaku / 1000000
                + " millisekuntia (" + hajautustaulunHaku + " nanosekuntia.)");

    }

}
