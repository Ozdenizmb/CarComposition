
public class VehicleTest {
    
    public static void main(String[] args) {
        
        Piston piston = new Piston("Koneks", "85mm");
        Motor motor = new Motor("Hyundai", 136, piston);
    
        Kasa kasa = new Kasa("Mercedes", "Siyah", 2021);
    
        Tekerlek tekerlek = new Tekerlek("Mercedes", 4);
        
        
        Araba car = new Araba(motor, kasa, tekerlek);
        
        car.getKasa().kasaCamTavan();
        car.getTekerlek().tekerlekDenemesi(3);
        car.getMotor().motorDevir(150);
        
    }
    
}
