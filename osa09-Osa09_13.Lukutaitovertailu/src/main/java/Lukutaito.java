/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Lukutaito implements Comparable<Lukutaito> {

    private String maa;
    private int vuosi;
    private String sukupuoli;
    private double lukutaitoprosentti;

    public Lukutaito(String maa, int vuosi, String sukupuoli, double lukutaitoprosentti) {

        this.maa = maa;
        this.vuosi = vuosi;
        this.sukupuoli = sukupuoli;
        this.lukutaitoprosentti = lukutaitoprosentti;
    }

    public String getMaa() {
        return maa;
    }

    public int getVuosi() {
        return vuosi;
    }

    public String getSukupuoli() {
        String hienoSukupuoli = sukupuoli.replace(" (%)","");
        return hienoSukupuoli;
    }

    public double getLukutaitoprosentti() {
        return lukutaitoprosentti;
    }

    @Override
    public int compareTo(Lukutaito lukutaitoinen) {
        if (this.lukutaitoprosentti == lukutaitoinen.getLukutaitoprosentti()) {
            return 0;
        } else if (this.lukutaitoprosentti > lukutaitoinen.getLukutaitoprosentti()) {
            return 1;
        } else {
            return -1;
        }
    }
}


