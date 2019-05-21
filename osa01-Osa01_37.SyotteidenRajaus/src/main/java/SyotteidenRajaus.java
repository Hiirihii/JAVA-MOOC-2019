
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Ohjelma pyytää käyttäjää syöttämään luvun
        // jos luku on negatiivinen ohjelma palaa,
        // kiertolauseen alkuun.
        // Jos luku on positiivinen ohjelma tulostaa luvun 
        //toisen potenssin.
        while (true){
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0){
                break;
            }
            
            if (luku < 0){
                System.out.println("Epäkelpo luku");
                continue;
            }
            luku = (luku * luku);
            System.out.println(luku);
                    
        
        }

    }
}
