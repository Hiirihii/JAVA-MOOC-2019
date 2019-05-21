
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int syote = Integer.valueOf(lukija.nextLine());
        int luku = syote;
        
        while(luku <= 100){
            System.out.println(luku);
            luku = luku + 1;
        }    

    }
}
