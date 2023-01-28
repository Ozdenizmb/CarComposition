
public class Piston {
    
    private String marka, boyut;
    
    public Piston(String marka, String boyut) {
        setMarka(marka);
        setBoyut(boyut);
    }
    
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    
    public String getMarka() {
        return marka;
    }
    public String getBoyut() {
        return boyut;
    }
    
}
