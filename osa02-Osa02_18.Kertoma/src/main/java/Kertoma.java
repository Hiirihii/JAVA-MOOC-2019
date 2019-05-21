
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku:");
        int syote = Integer.valueOf(lukija.nextLine());
        int summa = 1;
        int luku = 1;
        
        while(luku <= syote){
            summa = summa * luku;
            luku++;               
        }
        System.out.println("Kertoma on " + summa);
 

    }
}
