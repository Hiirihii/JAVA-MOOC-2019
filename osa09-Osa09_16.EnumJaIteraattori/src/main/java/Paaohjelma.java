
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        Tyontekijat t = new Tyontekijat();
        Henkilo h = new Henkilo("Arto", Koulutus.FT);
        Henkilo h1 = new Henkilo("Pertti", Koulutus.FT);
        Henkilo h2 = new Henkilo("Kuppa", Koulutus.FM);
        t.lisaa(h);
        t.lisaa(h1);
        t.lisaa(h2);
        t.tulosta(Koulutus.FT);
    }
}
