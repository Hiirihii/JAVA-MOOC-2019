
import java.util.ArrayList;
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> keskiarvo;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.keskiarvo = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
        this.keskiarvo.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }

    public double koepisteidenKeskiarvo() {
        int jaettava = 0;
        int jakaja = 0;
        for (Integer summa : this.keskiarvo) {

            jaettava += summa;
            jakaja++;
        }
        double keskiarvo = 1.0 * jaettava / jakaja;
        return keskiarvo;

    }
    
    public double arvosanojenKeskiarvo(){
        int jaettava = 0;
        int jakaja = 0;
        double arvosanojenkeskiarvo = 0.0;
        
        for(Integer key : this.arvosanat.keySet()){
            
            jaettava = key * this.arvosanat.get(key) + jaettava;
            jakaja = this.arvosanat.get(key) + jakaja;
   
        }
      
        
        arvosanojenkeskiarvo = 1.0 * jaettava /  jakaja;
     
        return arvosanojenkeskiarvo;
    }

  

      

    
    

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
