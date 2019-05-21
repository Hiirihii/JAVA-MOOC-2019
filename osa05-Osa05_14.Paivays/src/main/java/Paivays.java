
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    public void etene() {
        
        if ((this.paiva + 1) <= 30) {
            this.paiva++;
        } else if ((this.paiva + 1) > 30) {
            this.paiva = 1;
            this.kuukausi++;
        }
        if (this.kuukausi <= 12) {
            this.vuosi = this.vuosi;
        } else if (this.kuukausi > 12) {
            this.vuosi++;
            this.kuukausi = 1;
        }
    }

    public void etene(int montakoPaivaa) {

        if ((this.paiva + montakoPaivaa)<= 30) {
            this.paiva = this.paiva + montakoPaivaa;
        } else if (this.paiva + montakoPaivaa > 30) {
            this.paiva = this.paiva + montakoPaivaa - 30;
            this.kuukausi++;
        }
        if (this.kuukausi < 12) {
            this.vuosi = this.vuosi;
        } else if (this.kuukausi > 12) {
            this.vuosi++;
            this.kuukausi = 1;
        }

    }

    public Paivays paivienPaasta(int paivia) {

        Paivays uusiPaivays = new Paivays(paiva, kuukausi, vuosi);

    // tehdään jotain...
    uusiPaivays.etene(paivia);

    return uusiPaivays;
    }

}
