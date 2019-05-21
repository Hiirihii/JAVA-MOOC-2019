
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulostettavat = 0;
        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        
        while(tulostettavat < luvut.size()){
        System.out.println(luvut.get(tulostettavat));
        tulostettavat++;
        }
        

    }
}
