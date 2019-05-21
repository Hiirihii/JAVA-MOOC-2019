
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int syote1 = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Mistä lähtien?");
        int syote2 = Integer.valueOf(lukija.nextLine());
        
        int luku = syote2;
        
        while(luku <= syote1){
            System.out.println(luku);
            luku = luku + 1;
            
            if (syote2 > syote1){
                System.out.println("");
            }
        
        }
    }
}
