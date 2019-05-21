
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
        int syote = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        int luku = 0;
        
        while(luku <= syote){
            
           if(luku <= 3){               
               summa = summa +1;
           }else if(luku > 3){               
               summa = summa + (luku - 1);
           }
           
           luku++; 

        }
        summa = summa + (syote -1);
        System.out.println("Summa on " + summa);
    }
}
