
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        // kirjoita koodia tähän
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return
        if (luku1 > luku2){
            return luku2;
        } else if (luku1 < luku2){
            return luku1;
        } else {
            return luku1;
        }
        
       
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 2);
        System.out.println("Pienin: " + vastaus);
    }
}
