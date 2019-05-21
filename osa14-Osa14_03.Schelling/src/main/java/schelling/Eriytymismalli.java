package schelling;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private Taulukko taulukko;

    private double prosAlueestaKaytossa;
    private int tyytyvaisyysraja;
    private int ryhmienLukumaara;

    private boolean kaynnissa;

    public Eriytymismalli(int leveys, int korkeus, int tyytyvaisyysraja, int ryhmienLukumaara, double prosAlueestaKaytossa) {
        this.taulukko = new Taulukko(leveys, korkeus);

        this.tyytyvaisyysraja = tyytyvaisyysraja;
        this.ryhmienLukumaara = ryhmienLukumaara;
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;

        this.kaynnissa = false;
    }

    public void kaynnista() {
        this.kaynnissa = true;
    }

    public void sammuta() {
        this.kaynnissa = false;
    }

    public boolean onKaynnissa() {
        return this.kaynnissa;
    }

    public void asetaRyhmienLukumaara(int ryhmia) {
        this.ryhmienLukumaara = ryhmia;
    }

    public void asetaProsAlueestaKaytossa(double prosAlueestaKaytossa) {
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;
    }

    public void asetaTyytyvaisyysRaja(int tyytyvaisyysraja) {
        this.tyytyvaisyysraja = tyytyvaisyysraja;

    }

    public void alusta() {
        arvoAlkuarvot();
    }

    public void arvoAlkuarvot() {
        Random arpoja = new Random();

        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {

                // Random-luokan metodi nextDouble palauttaa satunnaisen luvun
                // nollan ja yhden välillä
                double satunnainenLukuNollanJaYhdenValilla = arpoja.nextDouble();

                // jos 100*arvo on pienempi kuin prosAlueestaKaytossa, paikkaan
                // asetetaan arvo
                if (100 * satunnainenLukuNollanJaYhdenValilla < prosAlueestaKaytossa) {
                    int ryhma = 1 + arpoja.nextInt(ryhmienLukumaara);

                    this.taulukko.aseta(x, y, ryhma);

                }
            }
        }
    }

    public Taulukko getData() {
        return this.taulukko;
    }

    public void setData(Taulukko taulukko) {
        this.taulukko = taulukko;
    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        // Luo täällä lista, missä on kaikki tyhjät paikat piste-olioina.
        // Tyhjissä paikoissa on arvo 0
        for (int x = 0; x < taulukko.getLeveys(); x++) {
            for (int y = 0; y < taulukko.getKorkeus(); y++) {
                if (taulukko.hae(x, y) == 0) {
                    tyhjat.add(new Piste(x, y));
                }
            }
        }

        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            int tyytymattomanRyhma = this.taulukko.hae(tyytymaton.getX(), tyytymaton.getY());

            this.taulukko.aseta(tyhja.getX(), tyhja.getY(), tyytymattomanRyhma);
            this.taulukko.aseta(tyytymaton.getX(), tyytymaton.getY(), 0);
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        // Etsi täällä tyytymättömät

        //käydään taulukko läpi alkio alkiolta
        for (int leveys = 0; leveys < taulukko.getLeveys(); leveys++) {
            for (int korkeus = 0; korkeus < taulukko.getKorkeus(); korkeus++) {

                //asetetaan tämän alkion arvo muuttujaan arvo
                int arvo = taulukko.hae(leveys, korkeus);
                int tyytyvaisyys = 0;

                //skipataan jos paikka on tyhjä
                if (arvo == 0) {
                    continue;
                }

                //käytään naapurit läpi
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {

                        //ei lasketa itseään mukaan
                        if (x == 0 && y == 0) {
                            continue;
                        }

                        /*
                        if (leveys + x < 0) {
                            continue;
                        }*/

                        if (leveys + x > leveys - 1) {
                            continue;
                        }
                        // ei vaikuta
                        if (korkeus - y < 0) {
                            continue;
                        }

                        if (korkeus + y > korkeus - 1) {
                            continue;
                        }

                        //katsotaan, onko arvo sama.
                        // pohjoinen
                        if (arvo == taulukko.hae(leveys, korkeus - y)) {
                            tyytyvaisyys++;
                        }
                        // koillinen
                        if (arvo == taulukko.hae(leveys + x, korkeus - y)) {
                            tyytyvaisyys++;
                        }
                        //itä
                        if (arvo == taulukko.hae(leveys + x, korkeus)) {
                            tyytyvaisyys++;
                        }
                        //kaakko
                        if (arvo == taulukko.hae(leveys + x, korkeus + y)) {
                            tyytyvaisyys++;
                        }
                        //etelä
                        if (arvo == taulukko.hae(leveys, korkeus + y)) {
                            tyytyvaisyys++;
                        }
                        //lounas
                        if (arvo == taulukko.hae(leveys - x, korkeus + y)) {
                            tyytyvaisyys++;
                        }
                        //länsi
                        if (arvo == taulukko.hae(leveys - x, korkeus)) {
                            tyytyvaisyys++;
                        }
                        //loude
                        if (arvo == taulukko.hae(leveys - x, korkeus - y)) {
                            tyytyvaisyys++;
                        }
                    }

                    
                }

                //jos tyytyväisyys on pienempi kuin tyytyväisyysraja, lisätään tyytymättömiin uusi piste
                if (tyytyvaisyys < this.tyytyvaisyysraja) {
                    tyytymattomat.add(new Piste(leveys, korkeus));
                    //System.out.println(leveys + "/"+ korkeus + "/" + tyytyvaisyys );
                }

            }
        }

        return tyytymattomat;
    }

    public void tyhjenna() {
        for (int x = 0; x < taulukko.getLeveys(); x++) {
            for (int y = 0; y < taulukko.getKorkeus(); y++) {
                taulukko.aseta(x, y, 0);
            }
        }
    }

}
