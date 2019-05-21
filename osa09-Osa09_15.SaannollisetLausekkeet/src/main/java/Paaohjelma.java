
import java.util.Scanner;



public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja
        Tarkistin tarkistin = new Tarkistin();
        System.out.print("Anna merkkijono:");
        String syote = lukija.nextLine();
        
      
        if(tarkistin.kellonaika(syote) == true){
            System.out.println("Muoto on oikea.");
        } else {
            System.out.println("Muoto ei ole oikea.");
        }
               
    }
}
