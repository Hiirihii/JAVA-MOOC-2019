/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
public class Lista<T> {

    private T[] listat;
    private int listanArvot;

    public Lista() {
        this.listat = (T[]) new Object[10];
        this.listanArvot = 0;
    }

    public void lisaa(T arvo) {
        if (this.listanArvot == this.listat.length) {
            kasvata();
        }

        this.listat[this.listanArvot] = arvo;
        this.listanArvot++;
    }

    private void kasvata() {
        int uusiKoko = this.listat.length + this.listat.length / 2;
        T[] uusi = (T[]) new Object[uusiKoko];
        for (int i = 0; i < this.listat.length; i++) {
            uusi[i] = this.listat[i];
        }

        this.listat = uusi;
    }

    public boolean sisaltaa(T arvo) {
        return arvonIndeksi(arvo) >= 0;
    }

    public int arvonIndeksi(T arvo) {
        for (int i = 0; i < this.listanArvot; i++) {
            if (this.listat[i].equals(arvo)) {
                return i;
            }
        }

        return -1;
    }

    private void siirraVasemmalle(int indeksistaLahtien) {
        for (int i = indeksistaLahtien; i < this.listanArvot - 1; i++) {
            this.listat[i] = this.listat[i + 1];
        }
    }

    public void poista(T arvo) {
        int arvonIndeksi = arvonIndeksi(arvo);
        if (arvonIndeksi < 0) {
            return; // ei löydy
        }

        siirraVasemmalle(arvonIndeksi);
        this.listanArvot--;
    }

    public T arvo(int indeksi) {
        if (indeksi < 0 || indeksi >= this.listanArvot) {
            throw new ArrayIndexOutOfBoundsException("Indeksi " + indeksi + " alueen [0, " + this.listanArvot + "[ ulkopuolella.");
        }

        return this.listat[indeksi];
    }

    public int koko() {
        return this.listanArvot;
    }

}
