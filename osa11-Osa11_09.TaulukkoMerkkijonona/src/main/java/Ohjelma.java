
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int[][] matriisi = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(taulukkoMerkkijonona(matriisi));
    }

    public static String taulukkoMerkkijonona(int[][] taulukko) {
        int[][] matriisi = taulukko;
          

    
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < matriisi.length; rivi++) {
            for (int sarake = 0; sarake < matriisi[rivi].length; sarake++) {
                palautus.append(matriisi[rivi][sarake]);
            }

            palautus.append("\n");
        }

        return palautus.toString();
    }

}
