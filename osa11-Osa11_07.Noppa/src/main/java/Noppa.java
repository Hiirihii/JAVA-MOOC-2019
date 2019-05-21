
import java.util.Random;

public class Noppa {

    private Random random;
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.random = new Random();
        // Alusta muuttuja tahkojenMaara tässä
         this.tahkojenMaara = tahkojenMaara + 1;
       
    }

    public int heita() {
        // arvotaan luku väliltä 1-tahkojenMaara
        while(true){
           int heitonTulos = this.random.nextInt(tahkojenMaara);
           
            if(heitonTulos == 0){
                continue;
            }
            if(heitonTulos > 0 || heitonTulos <= tahkojenMaara ){
                return heitonTulos;
            }
        
        
        }
        
    }
}
