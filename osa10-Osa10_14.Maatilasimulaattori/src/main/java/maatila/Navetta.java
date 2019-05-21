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
public class Navetta {

    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;

    }

    public Maitosailio getMaitosailio() {
        return this.maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }

    public void hoida(Lehma lehma) {
        if (this.lypsyrobotti != null) {
            this.lypsyrobotti.lypsa(lehma);
        } else {
            throw new IllegalStateException();
        }
    }

    public void hoida(List<Lehma> lehmat) {

        for (Lehma muu : lehmat) {
            this.maitosailio.lisaaSailioon(muu.getMaara());
            muu.lypsa();
        }
    }

    public String toString() {
        String navetta = String.valueOf(this.maitosailio);
        return navetta;
    }

}
