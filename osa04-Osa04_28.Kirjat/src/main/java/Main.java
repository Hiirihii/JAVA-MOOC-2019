
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<Kirjat> kirjoja = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            
            System.out.print("Kirjoitusvuosi: ");
            int kirjoitusvuosi = Integer.valueOf(lukija.nextLine());

            kirjoja.add(new Kirjat(nimi, sivuja, kirjoitusvuosi));
       
            
       
        }

        System.out.println("");

        System.out.print("Mitä Tulostetaan? ");
        String syote = lukija.nextLine();

   
    
            if (syote.equals("kaikki")) {
                
                for (Kirjat kirja: kirjoja) {
                    System.out.println(kirja);
                }
            } else if(syote.equals("nimi")){
                 for (Kirjat kirja: kirjoja) {
                    System.out.println(kirja.getNimi());
                }
            } 

  
        
    

    }
}