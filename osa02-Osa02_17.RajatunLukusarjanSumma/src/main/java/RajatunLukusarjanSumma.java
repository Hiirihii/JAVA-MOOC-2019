
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen: ");
        int eka = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Toinen: ");
        int toka = Integer.valueOf(lukija.nextLine());
        
        int luku = 0;
        int summa = 0;
       
        
        while(luku < toka){
            
           
            if(luku == eka ){
              summa = eka;
            } else if (luku > eka){
              summa = summa + luku;
            }
            
            luku++;
        }
        summa = summa + toka ;
        System.out.println("Summa on " + summa);    
    }
}
