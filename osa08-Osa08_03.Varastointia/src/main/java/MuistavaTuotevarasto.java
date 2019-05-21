/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ottol
 */
import java.util.ArrayList;

public class MuistavaTuotevarasto extends Tuotevarasto {

    
   
    private Muutoshistoria historia = new Muutoshistoria();

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {

        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        historia.lisaa(alkuSaldo);

    }

    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        double summa  = getSaldo(); 
        historia.lisaa(summa);

    }

    @Override
    public double otaVarastosta(double maara) {
         double summa = getSaldo() - maara;
        if(maara > getSaldo()){
     
            return getSaldo();
        } else{
            
            super.otaVarastosta(maara);
        
        }
   
        historia.lisaa(summa);
        return summa;

    }

    public String historia() {

        return historia.toString();
    }

    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + getNimi());
        System.out.println("Historia: " + historia);
        System.out.println("Suurin tuotemäärä: " + historia.maxArvo());
        System.out.println("Pienin tuotemäärä: " + historia.minArvo());
        System.out.println("Keskiarvo: " + historia.keskiarvo());
    }
}
