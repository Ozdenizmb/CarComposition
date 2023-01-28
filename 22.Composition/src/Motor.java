
public class Motor {
    
    private String marka;
    private double guc;
    private Piston piston;  // Composition
    
    public Motor(String marka, double guc, Piston piston) {
        setMarka(marka);
        setGuc(guc);
        setPiston(piston);
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setGuc(double guc) {
        this.guc = guc;
    }
    public void setPiston(Piston piston) {
        this.piston = piston;
    }
    
    public String getMarka() {
        return marka;
    }
    public double getGuc() {
        return guc;
    }
    public Piston getPiston() {
        return piston;
    }
    
    public void motorDevir(int devirSayisi) {
        System.out.println("Arac Motoru Saniyede " + devirSayisi + " Devretmektedir!");
    }
    
}
