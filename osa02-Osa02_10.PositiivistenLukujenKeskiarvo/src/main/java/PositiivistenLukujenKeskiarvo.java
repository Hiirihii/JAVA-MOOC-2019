
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        double keskiarvo = 0;
        int summa = 0;
        int lukumaara = 0;
        
        while(lukija.hasNextLine()){
            int syote = Integer.valueOf(lukija.nextLine());

            if(syote == 0){
                if(lukumaara == 0){
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                } else {
                    break;
                }
            } 
            if(syote > 0){
                lukumaara = lukumaara + 1;
                summa = syote + summa;
            }
        
            keskiarvo = (1.0* summa) / lukumaara;
        
        
        }
        System.out.println(keskiarvo);
        
        

    }
}
