
import java.io.File;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        int riveja = 0;
        
        try (Scanner mittaustenArvot = new Scanner(new File(tiedosto))){
            
            while(mittaustenArvot.hasNextLine()){
                
              int vertailuArvo = Integer.valueOf(mittaustenArvot.nextLine());
              
              if(vertailuArvo >= alaraja && vertailuArvo <= ylaraja ){
                  riveja++;
              } else {
                  continue;
              }
            }
        
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("Lukuja: " + riveja);

    }

}
