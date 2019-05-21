

public class Opiskelija implements Comparable<Opiskelija>{

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }
    
    public int compareTo(Opiskelija k){
        
        return this.nimi.compareToIgnoreCase(k.nimi);
    }
  

}
