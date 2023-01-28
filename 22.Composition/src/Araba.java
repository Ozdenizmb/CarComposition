
public class Araba {
    
    private Motor motor;        // Composition
    private Kasa kasa;          // Composition
    private Tekerlek tekerlek;  // Composition
    
    public Araba(Motor motor, Kasa kasa, Tekerlek tekerlek) {
        setMotor(motor);
        setKasa(kasa);
        setTekerlek(tekerlek);
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
    public void setTekerlek(Tekerlek tekerlek) {
        this.tekerlek = tekerlek;
    }
    
    public Motor getMotor() {
        return motor;
    }
    public Kasa getKasa() {
        return kasa;
    }
    public Tekerlek getTekerlek() {
        return tekerlek;
    }
    
}
