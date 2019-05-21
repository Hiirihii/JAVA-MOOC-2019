
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Arvosanarekisteri rekisteri = new Arvosanarekisteri();
        rekisteri.lisaaArvosanaPisteidenPerusteella(82);
        rekisteri.lisaaArvosanaPisteidenPerusteella(83);
        rekisteri.lisaaArvosanaPisteidenPerusteella(96);
        rekisteri.lisaaArvosanaPisteidenPerusteella(51);
        rekisteri.lisaaArvosanaPisteidenPerusteella(48);
        rekisteri.lisaaArvosanaPisteidenPerusteella(56);
        rekisteri.lisaaArvosanaPisteidenPerusteella(61);

        System.out.println(rekisteri.arvosanojenKeskiarvo());
        System.out.println(rekisteri.koepisteidenKeskiarvo());
    }
}
