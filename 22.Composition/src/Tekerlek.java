
public class Tekerlek {
    
    private String marka;
    private int tekerlekSayisi;
    
    public Tekerlek(String marka, int tekerlekSayisi) {
        setMarka(marka);
        setTekerlekSayisi(tekerlekSayisi);
    }
   
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi < 0 ? 0 : tekerlekSayisi;
    }
    
    public String getMarka() {
        return marka;
    }
    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }
    
    public void tekerlekDenemesi(int sayi) {
        System.out.println(sayi + " Adet Tekerlek Basariyla Teste Tabii Tutulmustur!");
    }
    
}
