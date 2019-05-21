
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int indeksi = 0;
        while(indeksi < taulukko.length){
            System.out.print(taulukko[indeksi]);
            if (indeksi < taulukko.length - 1){
                 System.out.print(", ");
            } else if (indeksi == taulukko.length) {
                System.out.println("");
            }     
       
            
            indeksi++;
        }
       
    }
}
