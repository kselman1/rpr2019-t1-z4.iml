package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s=new Supermarket();

        Artikl a = new Artikl("Cokolada", 4, "7");
        s.dodajArtikl(a);
        Artikl c = new Artikl("Igracka", 15, "3");
        s.dodajArtikl(c);
        Artikl []b= s.getArtikli();

        assertEquals("Cokolada",b[0].getNaziv());
    }

    @Test
    void izbaciArtiklSaKodom() {

        Supermarket s=new Supermarket();
        Artikl a=s.izbaciArtiklSaKodom("7");
        assertEquals(null,a);
    }
}