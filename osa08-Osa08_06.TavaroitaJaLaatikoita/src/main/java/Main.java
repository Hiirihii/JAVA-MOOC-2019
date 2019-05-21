// Muista toteuttaa luokilla myös rajapinta Talletettava. Luokkien tulee toimia seuraavasti:
public class Main {

    public static void main(String[] args) {
        // testaa täällä luokkiesi toimintaa

        
       
    Laatikko laatikko = new Laatikko(10);

    laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2)) ;
    laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 2));
    laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 7));

    laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
    laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
    laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

    System.out.println(laatikko);
        
        
        
    }
}

