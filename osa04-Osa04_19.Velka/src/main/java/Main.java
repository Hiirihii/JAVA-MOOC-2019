
public class Main {

    public static void main(String[] args) {
        // Kokeile täällä tehtävässä luomasi Velka-luokan toimintaa

        Velka asuntolaina = new Velka(115000, 1.02);
        asuntolaina.tulostaSaldo();

        asuntolaina.odotaVuosi();
        asuntolaina.tulostaSaldo();

        int vuosia = 0;

        while (vuosia < 20) {
            asuntolaina.odotaVuosi();
            vuosia++;
        }

        asuntolaina.tulostaSaldo();
    }
}
