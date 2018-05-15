package jhotel;
/**
 * Ini adalah kelas yang berfungsi untuk menginisiasi object Room.
 * Object Room terdiri dari object Hotel dan dan nomor kamar.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public abstract class Room
{
    // instance variables
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;

    /**
     * Constructor object kelas Room
     * @param hotel adalah parameter dengan tipe object dari kelas Hotel
     * @param nomor_kamar menyimpan nilai nomor_kamar berupa string
     *
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        status_kamar=StatusKamar.VACANT;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan object Hotel
     * @return hotel mengembalikan nilai object Hotel ke dalam variable hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan nomor_kamar
     * @return nomor_kamarmengembalikan nilai object Hotel ke dalam variable hotel
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan dailyTariff
     * @return dailyTariff mengembalikan nilai dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan status_kamar
     * @return status_kamar mengembalikan nilai status suatu kamar apakah vacant, booked, atau processed
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    /*
     * Ini adalah method abstract untuk mendapatkan tipe kamar dari enum TipeKamar
     *
     */
    public abstract TipeKamar getTipeKamar();

    /**
     * Ini adalah method mutator mengeset suatu object Hotel
     * @param hotel variabel untuk menyimpan object Hotel untuk dipassing ke varibale hotel
     *
     */
    public void setHotel(Hotel hotel){
        this.hotel=hotel;
    }

    /**
     * Ini adalah method mutator untuk mengeset nomor suatu kamar
     * @param nomor_kamar variabel untuk menyimpan nomor kamar untuk dipassing ke class variable nomor_kamar
     *
     */
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar=nomor_kamar;
    }

    /**
     * Ini adalah method mutator untuk mengeset harga kamar per hari
     * @param dailyTariff variabel untuk menyimpan harga harian kamar untuk dipassing ke class variablenya.
     *
     */
    public void setDailyTariff (double dailyTariff){
        this.dailyTariff=dailyTariff;
    }

    /**
     * Ini adalah method mutator untuk mengeset jumlah hari yang dipesan
     * @param status_kamar variabel untuk menyimpan status kamar untuk dipassing ke class variabelnya
     *
     */
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar=status_kamar;
    }

    /**
     * Ini adalah method untuk menampilakan data object maupun nilai variabel dalam bentuk String
     *
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            return "\nNama hotel    : " + hotel.getNama()+
                    "\nTipe kamar   : " + getTipeKamar() +
                    "\nHarga        : " + getDailyTariff() +
                    "\nStatus kamar : " + getStatusKamar();
        }
        else
        {
            return "\nNama hotel    : " + hotel.getNama() +
                    "\nTipe kamar   : " + getTipeKamar() +
                    "\nHarga        : " + getDailyTariff() +
                    "\nStatus kamar : " + getStatusKamar() +
                    "\nPelanggan    : " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }

    /*
    public void setPesanan (Pesanan pesan){
        this.pesan=pesan;
    }
    */

    /*
    public String toString(){
        if (isAvailable){
        return "\nNama Hotel        : "+hotel.getNama()+
               "\nTipe kamar        : "+getTipeKamar()+
               "\nHarga             : "+dailyTariff +
               "\nDate of Birth     : "+status_kamar;
               
            }
            else{
         return"\nNama Hotel        : "+hotel.getNama()+
               "\nTipe kamar        : "+getTipeKamar()+
               "\nHarga             : "+dailyTariff +
               "\nStatus kamar      : "+status_kamar+
               "\nPelanggan         : "+pesan.getPelanggan().getNama();
    }
    */
}
    /*
    public void printData(){
        System.out.println("Nama hotel :" + hotel.getNama());
        System.out.println("Nomor Kamar :" + nomor_kamar);
        System.out.println("Tersedia :" + isAvailable);
        System.out.println("Harga :" + dailyTariff);
        System.out.println("Status Kamar :" + status_kamar);
        System.out.println("Tipe Kamar :" + status_kamar);
    }
    */

