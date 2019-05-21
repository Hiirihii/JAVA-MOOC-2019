
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        List<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(-7);
        luvut.add(4);
        luvut.add(-2);
        luvut.add(6);
        positiiviset(luvut);
        

    }

    public static List<Integer> positiiviset(List<Integer> luvut) {

        ArrayList<Integer> uusiluvut = luvut.stream()
                .filter(luku -> luku > 0)
                .collect(Collectors.toCollection(ArrayList::new));
               
       System.out.println(uusiluvut);
       return uusiluvut;
        
       
    }
    
    

}
