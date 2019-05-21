package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];

        for (int rivi = 0; rivi < taulukko.length; rivi++) {
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
                int arvo = taulukko[rivi][sarake];

                if (arvo == 1 && elossaOleviaNaapureita(taulukko, rivi, sarake) < 2) {
                    kopio[rivi][sarake] = 0;
                } else if (arvo == 1 && elossaOleviaNaapureita(taulukko, rivi, sarake) == 2 || elossaOleviaNaapureita(taulukko, rivi, sarake) == 3 ) {
                    kopio[rivi][sarake] = 1;
                } else if (arvo == 1 && elossaOleviaNaapureita(taulukko, rivi, sarake) > 3) {
                    kopio[rivi][sarake] = 0;
                } 
                
                if (arvo == 0 && elossaOleviaNaapureita(taulukko, rivi, sarake) != 3) {
                    kopio[rivi][sarake] = 0;
                } else if (arvo == 0  && elossaOleviaNaapureita(taulukko, rivi, sarake) == 3){
                    kopio[rivi][sarake] = 1;
                }
            }
            
        }
        taulukko = kopio;
    }

    

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int elossa = 0;
 
     
        if ( x + 1 < taulukko.length && taulukko[x + 1][y] == 1) {
            elossa++;
        }
        if (y + 1 < taulukko[x].length && taulukko[x][y + 1] == 1) {
            elossa++;
        }
        if ( x - 1 >= 0 && taulukko[x - 1][y] == 1) {
            elossa++;
        }
        if ( y - 1 >= 0 && taulukko[x][y - 1] == 1) {
            elossa++;
        }
        if (x + 1 < taulukko.length && y + 1 < taulukko[x].length && taulukko[x + 1][y + 1] == 1) {
            elossa++;
        }
        if ( x - 1 >= 0 && y - 1 >= 0 && taulukko[x - 1][y - 1] == 1)  {
            elossa++;
        }
        if ( x + 1 < taulukko.length && y - 1 >= 0 && taulukko[x + 1][y - 1] == 1) {
            elossa++;
        }
        if ( x - 1 >= 0 && y + 1 < taulukko[x].length && taulukko[x - 1][y + 1] == 1) {
            elossa++;
        }
        
        return elossa;
    }

}
