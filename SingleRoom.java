
/**
 * Write a description of class SingleRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SingleRoom extends Room {
    // instance variables - replace the example below with your own    private int x;
    private static TipeKamar TIPE_KAMAR=TipeKamar.SINGLE;
    /**
     * Constructor for objects of class SingleRoom
     */
  
    public SingleRoom(Hotel hotel,String nomor_kamar,boolean isAvailable, StatusKamar status_kamar)
    {
        super(hotel,nomor_kamar,isAvailable, status_kamar);
        
        
    }

  
    public TipeKamar getTipeKamar()
    {
       return TIPE_KAMAR;
    }
}
