
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
public class Putki<T> {

    private ArrayList<T> arvot = new ArrayList<>();

    public Putki() {

    }

    public void lisaaPutkeen(T arvo) {
        this.arvot.add(arvo);
    }

    public T otaPutkesta() {
        int indeksi = 0;
        boolean totuusarvo = this.arvot.isEmpty();
        if (totuusarvo == true) {
            return null;
        } else {
            T arvo = this.arvot.get(indeksi);
            this.arvot.remove(indeksi);
            return arvo;
        }

    }

    public boolean onkoPutkessa() {
        boolean onko = this.arvot.isEmpty();

        if (onko == true) {
            return false;
        } else {
            return true;
        }
    }
}
