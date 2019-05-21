package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        int kertoma = 0;
        if (luvusta < 0 ) {
            throw new IllegalArgumentException("Arvosanan tulee olla välillä 0-5");
        } else {
            kertoma = 1;
            for (int i = 1; i <= luvusta; i++) {
                kertoma *= i;
            }
           
        }
          return kertoma;
    }
         

     
    
    

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
            int osoittaja = 0;
            int nimittaja = 0;
        
          if (joukonKoko < 0 || osaJoukonKoko < 0 || osaJoukonKoko > joukonKoko) {
            throw new IllegalArgumentException("Arvosanan tulee olla välillä 0-5");
        } else {
            osoittaja = kertoma(joukonKoko);
            nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);
          }
      

        return osoittaja / nimittaja;
    }
}
