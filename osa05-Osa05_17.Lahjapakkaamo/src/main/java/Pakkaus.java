/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author ottol
 *
 */
public class Pakkaus {

    private ArrayList<Lahja> lahja;


    public Pakkaus() {
        this.lahja = new ArrayList<>();
        
    }

    public void lisaaLahja(Lahja lahja) {
        this.lahja.add(lahja);
    }

    public int yhteispaino() {
         int yhteispaino = 0;
        for (Lahja lahja : this.lahja) {
            yhteispaino = yhteispaino + lahja.getPaino();
        }
          return yhteispaino;
    }

}


