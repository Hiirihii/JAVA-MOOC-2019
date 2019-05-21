
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Montako satunnaislukua tulostetaan?");
        int lukujenMaara = Integer.valueOf(lukija.nextLine());
        
        Random arpoja = new Random(); // luodaan apuväline arpoja

        for (int i = 0 ; i < lukujenMaara; i++) {
            // Arvotaan ja tulostetaan satunnainen luku
            int luku = arpoja.nextInt(11);
            System.out.println(luku);
        }
    }

}
