
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ottol
 */
public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimiPaino;
    private ArrayList<Tavara> lista;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        
        this.maksimiPaino = maksimipaino;
        this.lista = new ArrayList<>();
        
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
            if (lista.contains(tavara)) {
            return true;
        }
        return false;
    }

    @Override
    public void lisaa(Tavara tavara) {
        int summa = 0;
 
        for (Tavara paino : lista) {
            summa = summa + paino.getPaino();
        }
        if (summa + tavara.getPaino() <= maksimiPaino) {
            lista.add(tavara);
            
        }
               
    }

}
