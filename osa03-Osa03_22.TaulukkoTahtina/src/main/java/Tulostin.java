
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
            int indeksi = 0;
            int tahtienMaara = 0;
            for (Integer tahtia: taulukko) {
                
                while(tahtienMaara < taulukko[indeksi]){
                   System.out.print("*");
                   tahtienMaara++;   
                }
                System.out.println("");
                tahtienMaara = 0;
                indeksi++;
     

            }
        
        
    }
}


