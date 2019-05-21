/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
import java.util.ArrayList;

public class Lauma implements Siirrettava {

    private ArrayList<Siirrettava> lauma = new ArrayList<>();

    @Override
    public String toString() {
        String tulostus = "";
        for(Siirrettava i : lauma){
            tulostus = tulostus +  i + "\n";
        }
        return tulostus;
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        lauma.add(siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {

        for (Siirrettava i : lauma) {
            i.siirra(dx, dy);
        }
    }

}
