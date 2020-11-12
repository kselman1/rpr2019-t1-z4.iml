package ba.unsa.etf.rpr;


public class Supermarket {

    Artikl []artikli=new Artikl[1000];
    private int i=0;

    void dodajArtikl(Artikl a){
        if(i<=1000 && a!=null){
            artikli[i]=a;
            i=i+1;

        }

    }
    public Artikl[] getArtikli(){
        return artikli;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        int j=0;
        Artikl a=null;
        for(j=0; j<i; j++){
            if(artikli[j].getKod().equalsIgnoreCase(kod)){
                a=artikli[j];
                int k=0;
                for(k=j; k<i-1; k++){
                    artikli[k]=artikli[k+1];
                }
                i=i-1;
                artikli[i]=null;
            }
        }
        return a;
    }
}
