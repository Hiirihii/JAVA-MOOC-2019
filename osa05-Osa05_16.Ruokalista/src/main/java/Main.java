
public class Main {
    public static void main(String[] args) {
        Ruokalista ateriat = new Ruokalista();
        
        // Kun olet luonut metodin lisaaAteria(String ateria), 
        // voit poistaa allaolevat kommentit
        
        ateriat.lisaaAteria("Pariloitua lohta ja kuhaa, basilikalla maustettua valkoviinivoikastiketta.");
        ateriat.lisaaAteria("Kesäinen vihersalaatti ja omena-hunajavinegretti.");
        ateriat.lisaaAteria("Paahdettua karitsan seläkettä ja punaviinikastiketta.");
        
        // Kun olet luonut metodin tulostaAteriat(), 
        // voit poistaa allaolevan kommentin
        
       ateriat.tulostaAteriat();
        
        // Kun olet luonut metodin tyhjennaRuokalista(), voit poistaa 
        // allaolevat kommentit
        ateriat.tyhjennaRuokalista();
        ateriat.tulostaAteriat();
    }
}
