package ba.unsa.etf.rpr;

public class Korpa {

    Artikl [] artikli=new Artikl[50];
     private int i=0;


    public boolean dodajArtikl(Artikl a){
        if(i<=50 ) {

            artikli[i] = a;
            i=i+1;
        }
        else return false;

        return true;
    }
    public Artikl[] getArtikli(){
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        int j=0;
        Artikl a=null;
        for(j=0; j<i-1; j++){
            if(artikli[j].getKod().equalsIgnoreCase(kod)){
                a=artikli[j];
                int k=0;
                for(k=j; k<i; k++){
                    artikli[k]=artikli[k+1];
                }
                i=i-1;
                artikli[i]=null;
            }
        }
        return a;
    }
    public int dajUkupnuCijenuArtikala(){
        int j=0;
        int ukupno=0;
        for(j=0; j<i; j++){
            ukupno=ukupno+artikli[j].getCijena();
        }
        return ukupno;
    }

}
