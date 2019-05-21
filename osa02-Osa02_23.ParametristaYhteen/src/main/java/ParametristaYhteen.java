
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        tulostaLuvustaYhteen(luku);

    }
    
    public static void tulostaLuvustaYhteen(int luku){
        
        int lukuja = luku;
        
        while(lukuja >= 1) {
            System.out.println(lukuja);
            lukuja = lukuja - 1;
        }
    
        
    
    }

}
