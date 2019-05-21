
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        System.out.println("Ketä etsitään?");
        String kuka = lukija.nextLine();
        
        if (lista.contains(kuka)) {
        System.out.println(kuka + " löytyi");
        } else {
            System.out.println(kuka + " ei löytynyt!");
        }

    }
}
