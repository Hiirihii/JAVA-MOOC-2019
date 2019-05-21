/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Sanakirja sanakirja;
    private Scanner lukija;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
        this.lukija = lukija;

    }

    public void kaynnista() {
        System.out.println("Komennot:");
        System.out.println("lisaa - lisää sanaparin sanakirjaan");
        System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("lopeta - poistuu käyttöliittymästä");
        System.out.println(" ");

        while (true) {

            System.out.print("Komento: ");
            String syote = lukija.nextLine();

            if (syote.equals("lopeta")) {
                break;
            } else if (syote.equals("lisaa")) {
                System.out.println("Suomeksi:");
                String suomeksi = lukija.nextLine();

                System.out.println("Käännös:");
                String kaannos = lukija.nextLine();
                
                this.sanakirja.lisaa(suomeksi, kaannos);

            } else if(syote.equals("kaanna")){
                System.out.println("Anna sana: ");
                String avain = lukija.nextLine();
                
                System.out.println("Käännös: " + this.sanakirja.kaanna(avain));
                
            }
        }
        System.out.println("Hei hei!");
    }

}
