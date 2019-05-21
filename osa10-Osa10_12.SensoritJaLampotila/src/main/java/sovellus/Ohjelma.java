package sovellus;

public class Ohjelma {

    public static void main(String[] args) {
        // voit testata luokkiasi täällä
        Keskiarvosensori ka = new Keskiarvosensori();
        ka.lisaaSensori(new Vakiosensori(3));
        ka.lisaaSensori(new Vakiosensori(7));
        System.out.println(ka.mittaa());
        System.out.println(ka.mittaukset());
    }

}
