
import java.util.ArrayList;

public class NullPointerExceptionOhjelma {

    public static void main(String[] args) {
        // Toteuta tai muokkaa ohjelmaa siten, että ohjelmassa tapahtuu 
        // NullPointerException -virhe

        Henkilo joan = new Henkilo("Joan Ball");
        System.out.println(joan);

        joan = null;
        joan.vanhene();

    }
}
