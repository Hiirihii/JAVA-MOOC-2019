
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimi = new ArrayList<>();

        while (true) {

            String syote = lukija.nextLine();

            if (syote.equals("")) {
                break;

            } else {
                nimi.add(syote);
            }

        }
        String yhdistetty = nimi.stream()
                .reduce("", (edellinenMjono, sana) -> edellinenMjono + sana + "\n");
        
        System.out.println(yhdistetty);

    }
}
