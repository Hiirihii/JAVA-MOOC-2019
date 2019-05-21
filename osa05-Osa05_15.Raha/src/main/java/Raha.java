
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

    public Raha plus(Raha lisattava) {

        Raha uusi = new Raha((this.euroa + lisattava.euroa), (this.senttia + lisattava.senttia)); // luodaan uusi Raha-olio jolla on oikea arvo

        // palautetaan uusi Raha-olio
        return uusi;
    }

    public boolean vahemman(Raha verrattava) {

        if (this.euroa < verrattava.euroa) {
            return true;
        } else if (this.euroa == verrattava.euroa && this.senttia < verrattava.senttia) {
            return true;
        } else {
            return false;
        }
    }

    public Raha miinus(Raha vahentaja) {
        int uusiEuroa = this.euroa - vahentaja.euroa;
        int uusiSenttia = this.senttia - vahentaja.senttia;

        if (uusiEuroa < 0) {
            Raha uusi = new Raha(0, 0);
            return uusi;
        } else if (this.senttia - vahentaja.senttia < 0 && this.euroa - vahentaja.euroa >= 1) {
            uusiEuroa = this.euroa - vahentaja.euroa - 1;
            uusiSenttia = this.senttia - vahentaja.senttia + 100;
            Raha uusi = new Raha(uusiEuroa, uusiSenttia);
            return uusi;

        } else {
            Raha uusi = new Raha(uusiEuroa, uusiSenttia);
            return uusi;
        }

    }

}
