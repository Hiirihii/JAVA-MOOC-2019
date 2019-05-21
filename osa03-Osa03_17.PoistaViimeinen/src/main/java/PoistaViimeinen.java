
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);

        System.out.println(luvut);

       poistaViimeinen(luvut);

        System.out.println(luvut);

        poistaViimeinen(luvut);
        poistaViimeinen(luvut);
        poistaViimeinen(luvut);

System.out.println(luvut);
    }
    
    public static void poistaViimeinen(ArrayList<Integer> luvut){
        int viimeinenIndeksi = luvut.size();
        if (luvut.size() == 0) {
            return;
        }
       viimeinenIndeksi--;
       luvut.remove(viimeinenIndeksi);
    }
}
    
