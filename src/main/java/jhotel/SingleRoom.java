package jhotel;
/**
 * Ini adalah kelas yang berfungsi untuk menyediakan tipe kamar Single
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class SingleRoom extends Room {
    // instance variables
    private static TipeKamar TIPE_KAMAR=TipeKamar.SINGLE;
    /**
     * Constructor object kelas SingleRoom
     * @param hotel adalah parameter dengan tipe object dari kelas Hotel
     * @param nomor_kamar menyimpan nilai nomor_kamar
     *
     */
    public SingleRoom(Hotel hotel,String nomor_kamar)
    {
        super(hotel,nomor_kamar);
    }

  
    public TipeKamar getTipeKamar()
    {
       return TIPE_KAMAR;
    }
}
