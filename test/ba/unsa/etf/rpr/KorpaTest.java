package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k=new Korpa();

        Artikl a = new Artikl("Cokolada", 4, "7");
        assertTrue(k.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a=null;
        Korpa k=new Korpa();
        a=k.izbaciArtiklSaKodom("7");
    }
}