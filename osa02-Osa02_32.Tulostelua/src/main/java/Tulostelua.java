
public class Tulostelua {

    public static void main(String[] args) {
    
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(17, 3);
        System.out.println("\n---");
        tulostaKolmio(6);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
       int lukema = 0;
       
        while(lukema < maara){
            System.out.print("*");
            lukema++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        int kertoja = 0;
        
        while(kertoja < sivunpituus){           
               tulostaTahtia(sivunpituus);
               kertoja++;
        }
        
        }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        int lukuja = 1;
        while(lukuja <= korkeus){           
            tulostaTahtia(leveys);
            lukuja++;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        
         int lukuja = 1;
         int pohja = 1;
        while(lukuja <= koko){           
            tulostaTahtia(pohja);
            pohja++;
            lukuja++;
        }
    }
}
