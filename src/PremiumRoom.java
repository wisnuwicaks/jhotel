
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;

    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        super(hotel, nomor_kamar,isAvailable, status_kamar);
        
    }    
    
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    public double getDiscount(){
        return DISCOUNT;
    }
    
    public void setDailyTariff(double dailytariff){
        super.setDailyTariff((dailytariff*DISCOUNT));
    }
}
