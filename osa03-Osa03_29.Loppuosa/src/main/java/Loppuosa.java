import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna sana:");
        String syote = lukija.nextLine();
        
        System.out.println("Loppuosanpituus pituus:");
        int kuinkaMonta = Integer.valueOf(lukija.nextLine());
        int vahennys =  syote.length();
        int pituus = vahennys - kuinkaMonta;
        
        String loppuosa = syote.substring(pituus);
        System.out.println("Tulos: " + loppuosa );
    }
}
