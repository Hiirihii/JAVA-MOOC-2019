/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ottol
 */
import java.util.ArrayList;
import java.util.List;
 
public class Maatila implements Eleleva {
 
    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lehmat;
 
    public Maatila(String nimi, Navetta navetta) {
        this.omistaja = nimi;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }
 
    public String getOmistaja() {
        return this.omistaja;
    }
 
    @Override
    public void eleleTunti() {
        if (this.lehmat.isEmpty() == false) {
        for (Lehma a : this.lehmat) {
            a.eleleTunti();
        }
        }
    }
 
    public void lisaaLehma(Lehma e) {
        if (this.lehmat == null) {
            this.lehmat = new ArrayList<Lehma>();
        }
        this.lehmat.add(e);
    }
 
    public void hoidaLehmat() {
        for (Lehma muu : this.lehmat) {
            this.navetta.hoida(muu);
            muu.lypsa();
        }
    }
 
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }
 
    public String toString() {
        String lista = "";
 
        if (this.lehmat.isEmpty()) {
            lista = "Ei lehmiä.";
        } else {
            for (Lehma nauta : this.lehmat) {
 
                lista += "\n" + nauta.toString();
            }
        }
        return "Maatilan omistaja: " + this.omistaja + "\nNavetan maitosäiliö: "
                + this.navetta.toString() + "\nLehmät: " + lista;
    }
 
}

