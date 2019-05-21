
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        while(true){
            
            String syote = lukija.nextLine();
            
            if(syote.equals("loppu")){
                break;
            }
            int luku = Integer.valueOf(syote);
            int luvunKuutio = luku * luku * luku;
            System.out.println(luvunKuutio);
        }

    }
}
