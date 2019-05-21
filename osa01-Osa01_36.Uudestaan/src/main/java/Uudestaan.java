
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Ohjelma kysyy käyttäjältä kokonaislukua
        // Ohjelma kysyy lukua kunnes saa syötteenä luvun 4
        // Luku 4 lopettaa ohjelman
        while (true){
            System.out.println("Syötä luku (4 lopettaa)");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 4){
                break;
            }
            System.out.println("Syötit " + luku);
        
        }
        System.out.println("Valmista, kiitos!");

    }
}
