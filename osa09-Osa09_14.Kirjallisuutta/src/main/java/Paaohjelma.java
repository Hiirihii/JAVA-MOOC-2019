
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
public class Paaohjelma {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        /*kirjat.add(new Kirja("Soiva tuutulaulukirja", 0));
        kirjat.add(new Kirja("Kurkkaa kulkuneuvot", 0));
        kirjat.add(new Kirja ("Lunta tupaan", 12));
        kirjat.add(new Kirja ("Litmanen 10 ", 10));
 
        for (Kirja k: kirjat) {
                System.out.println(k);
        }*/
        
        while(true){
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");            
            String syote = lukija.nextLine();
            
            if(syote.equals("")){
                break;
            }else{
                System.out.print("Syötä kirjan pienin kohdeikä: ");
                Integer ika = Integer.valueOf(lukija.nextLine());
                kirjat.add(new Kirja(syote, ika));
            }
            
        }
        System.out.println("Yhteensä " + kirjat.size() + " kirjaa.");
            
        Comparator<Kirja> vertailija = Comparator
              .comparing(Kirja::getIka)
              .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, vertailija);
        
        System.out.println("Kirjat:");
        for (Kirja k: kirjat) {
            System.out.println(k);
        }
    }
 
}
