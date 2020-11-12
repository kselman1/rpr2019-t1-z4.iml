package ba.unsa.etf.rpr;


public class Artikl {

    private String naziv;
    private String broj;
    private int cijena;

    Artikl(String naziv, int cijena, String broj){
        setArtikl(naziv,cijena,broj);
    }

    void setArtikl(String naziv, int cijena, String broj) {

        this.naziv=naziv;
        this.broj=broj;
        this.cijena=cijena;
    }

    public String getKod() {
        return broj;
    }

    public String getNaziv(){
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

}
