
import java.util.ArrayList;

public class MaPu {

    // toteuta apumetodit tänne
    public static double keskiarvo(ArrayList<Integer> luvut) {
        int summa = 0;
        int lukumaara = 0;
        for (Integer luku : luvut) {
            summa = summa + luku;
            lukumaara++;
            
        }
        double keskiarvo = 1.0 * summa / lukumaara;
        return keskiarvo;
        
        
    }
}
