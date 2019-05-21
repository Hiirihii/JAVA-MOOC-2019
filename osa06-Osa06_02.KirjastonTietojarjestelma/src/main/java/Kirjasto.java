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

public class Kirjasto {

    private ArrayList<Kirja> uusiKirja;

    public Kirjasto() {
        this.uusiKirja = new ArrayList<>();

    }

    public void lisaaKirja(Kirja uusiKirja) {
        this.uusiKirja.add(uusiKirja);
    }

    public void tulostaKirjat() {
        for (Kirja kirja : this.uusiKirja) {
            System.out.println(kirja);
        }
    }

    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {

        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja kirja : uusiKirja) {
            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)) {
                loydetyt.add(kirja);

            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja kirja : uusiKirja) {
            if (StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)) {
                loydetyt.add(kirja);

            }
        }
        return loydetyt;

    }

    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (Kirja kirja : uusiKirja) {
            if (kirja.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }

}
