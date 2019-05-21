
public class Maksukortti {

    private double saldo;

    public Maksukortti(double saldo) {
        this.saldo = saldo;
    }

    public double saldo() {
        return this.saldo;
    }

    public void lataaRahaa(double lisays) {
        if(lisays >= 0){
            this.saldo += lisays;
        } else {
            this.saldo = this.saldo;
        }
      
    }

    public boolean otaRahaa(double maara) {
        // toteuta metodi siten että se ottaa kortilta rahaa vain jos saldo on vähintään maara
        // onnistuessaan metodi palauttaa true ja muuten false
        if(saldo >= maara){
            saldo = saldo - maara;
            return true;
        } else {
              return false;
        }
    }
}
