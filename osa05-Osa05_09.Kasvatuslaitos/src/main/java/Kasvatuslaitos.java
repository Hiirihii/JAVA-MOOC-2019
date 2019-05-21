
public class Kasvatuslaitos {
    private int punnitustenMaara;

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
         punnitustenMaara++;
        return  henkilo.getPaino();

    }
    
    public void syota(Henkilo henkilo){
        int henkilonPaino = henkilo.getPaino();
        henkilonPaino++;
        henkilo.setPaino(henkilonPaino);
    }
    
    public int punnitukset(){
       
       return punnitustenMaara;
    }
}
