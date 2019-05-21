/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.util.HashMap;

/**
 *
 * @author ottol
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.File;

public class MuistavaSanakirja {

    private HashMap<String, String> sanakirja = new HashMap<>();
    private HashMap<String, String> toinen = new HashMap<>();
    private File tiedosto;

    public MuistavaSanakirja() {

    }

    public MuistavaSanakirja(String tiedosto) {
        this.tiedosto = new File(tiedosto);
    }

    public boolean lataa() {
        try {
            Scanner tiedostonLukija = new Scanner(tiedosto);
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                lisaa(osat[0], osat[1]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void lisaa(String sana, String kaannos) {
        
        if (!this.sanakirja.containsKey(sana)) {
            
            this.sanakirja.putIfAbsent(sana, kaannos);
            this.toinen.putIfAbsent(kaannos, sana);
        } else {

            this.sanakirja.putIfAbsent(sana, kaannos);
        }
    }

    public String kaanna(String sana) {
        if (this.sanakirja.keySet().contains(sana)) {
            return this.sanakirja.get(sana);
        } else if (this.toinen.keySet().contains(sana)) {
            return this.toinen.get(sana);
        } else {
            return null;
        }
    }

    public void poista(String sana) {

        if (this.sanakirja.containsKey(sana)) {
            String avain = this.sanakirja.get(sana);
            this.sanakirja.remove(sana);
            this.toinen.remove(avain);
            
        } else if(this.toinen.containsKey(sana)) {
            
            String avain = this.toinen.get(sana);
            this.sanakirja.remove(avain);
            this.toinen.remove(sana);
        }
    }

    public boolean tallenna() {
        try {
            PrintWriter writer = new PrintWriter(this.tiedosto);
            for (String sana : this.sanakirja.keySet()) {
                writer.print(sana);
                writer.print(":");
                writer.println(this.sanakirja.get(sana));
            }

            writer.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
