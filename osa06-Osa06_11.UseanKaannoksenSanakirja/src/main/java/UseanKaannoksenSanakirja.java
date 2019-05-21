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
import java.util.HashMap;

public class UseanKaannoksenSanakirja {

    private HashMap<String, ArrayList<String>> kaannokset;

    public UseanKaannoksenSanakirja() {
        this.kaannokset = new HashMap<>();
    }

    public void lisaa(String sana, String kaannos) {
        this.kaannokset.putIfAbsent(sana, new ArrayList<>());
        this.kaannokset.get(sana).add(kaannos);

    }

    public ArrayList<String> kaanna(String sana) {

        if (this.kaannokset.get(sana) == null) {
            this.kaannokset.putIfAbsent(sana, new ArrayList<>());
            return this.kaannokset.get(sana);
        } else {

            return this.kaannokset.get(sana);
        }

    }

    public void poista(String sana) {

        this.kaannokset.remove(sana);
    }

}
