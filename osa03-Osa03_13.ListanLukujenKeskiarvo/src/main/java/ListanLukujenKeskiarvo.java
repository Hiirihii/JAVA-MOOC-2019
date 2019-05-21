
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
                Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        int summa = 0;
        int jakaja = 0;
        for(Integer luettu: lista){
            summa = summa + luettu;
            jakaja++;
            
        }
        double keskiarvo = 1.0 * summa / jakaja;
        System.out.println("Keskiarvo: " + keskiarvo);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
    }
}
