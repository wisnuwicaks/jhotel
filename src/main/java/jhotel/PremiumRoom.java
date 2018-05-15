package jhotel;
/**
 * Ini adalah kelas yang berfungsi untuk menyediakan tipe kamar Premium
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class PremiumRoom extends Room
{
    // instance variables
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;

    /**
     * Constructor object kelas PremiumRoom
     * @param hotel adalah parameter dengan tipe object dari kelas Hotel
     * @param nomor_kamar menyimpan nilai nomor_kamar berupa String
     *
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
    }

    /**
     *
     * @return TIPE_KAMAR mengembalikan nilai enum tipe kamar
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * Method ini digunakan untuk mengeset nilai diskon.
     * @param dailytariff adalah parameter untuk menerima nilai daillyTariff
     *
     */
    public void setDailyTariff(double dailytariff)
    {
        super.setDailyTariff((dailytariff*DISCOUNT));
    }
}
