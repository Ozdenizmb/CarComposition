
public class Kasa {
    
    private String marka, renk;
    private int model;
    
    public Kasa(String marka, String renk, int model) {
        setMarka(marka);
        setRenk(renk);
        setModel(model);
    }
    
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public void setModel(int model) {
        this.model = model < 1960 ? 0 : model;
    }
    
    public String getMarka() {
        return marka;
    }
    public String getRenk() {
        return renk;
    }
    public int getModel() {
        return model;
    }
    
    public void kasaCamTavan() {
        System.out.println("Aracın Kasasi Cam Tavan Yapilacaktir!");
    }
    
}
