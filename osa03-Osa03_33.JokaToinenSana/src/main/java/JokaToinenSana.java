
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        while (true) {
            int indeksi = 0;
            String syote = lukija.nextLine();
            String[] palat = syote.split("\\s+");
            if(syote.equals("")){
                break;
            }
            while(indeksi < palat.length){
                
                if(indeksi % 2 != 0){
                
                    System.out.println(palat[indeksi]);
                    indeksi = indeksi + 1;
                } else{
                     indeksi = indeksi + 1;
                }
                    
            }
   
        }


    }
}
