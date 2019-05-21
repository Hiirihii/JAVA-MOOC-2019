
public class TulosteluaLikeABoss {
    
    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        tulostaKolmio(6);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
            int lukema = 0;
       
        while(lukema < maara){
            
            System.out.print("*");
            lukema++;
        }
        System.out.println();
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        
        int lukema = 0;
       
        while(lukema < maara){
            
            System.out.print(" ");
            lukema++;
        }
    }

    public static void tulostaKolmio(int koko){
        // tehtävän osa 2  
         int lukuja = 1;
         int pohja = 1;
         int tyhjaa = koko - 1;
        while(lukuja <= koko){
            tulostaTyhjaa(tyhjaa);
            tulostaTahtia(pohja);
            pohja++;
            lukuja++;
            tyhjaa--;
        } 
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int kerros = 0;
        int pohja = 1;
        int tyhjaa = korkeus - 1;
        while(kerros < korkeus){
            tulostaTyhjaa(tyhjaa);
            tulostaTahtia(pohja);
            pohja = pohja + 2;
            kerros++;
            tyhjaa--;
            
        }
        tyhjaa = korkeus - 2;
        tulostaTyhjaa(tyhjaa);
        tulostaTahtia(3);
        tulostaTyhjaa(tyhjaa);
        tulostaTahtia(3);
        
                
    }

}

