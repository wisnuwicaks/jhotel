
/**
 * Write a description of class Room here.
 *
 * @author Wisnu Wicaksono
 * @version 12 April 2018
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    //private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    //private Pesanan pesan;
 
    
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel=hotel;
        this.nomor_kamar=nomor_kamar;
        this.status_kamar=StatusKamar.VACANT;
    }
    
    public Hotel getHotel()
    {
        return hotel;
    }

    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    public double getDailyTariff()
    {
        return dailyTariff;
    }
    /*
    public Pesanan getPesanan(){
        return pesan;
    }
    */

    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    public abstract TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel){
        this.hotel=hotel;
    }
  
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar=nomor_kamar;
    }
    
    public void setDailyTariff (double dailyTariff){
        this.dailyTariff=dailyTariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar=status_kamar;
    }

    public String toString()
    {
        if(DatabasePesanan.getPesanan(this) == null)
        {
            return "\nNama hotel    : " + getHotel().getNama()+
                    "\nTipe kamar   : " + getTipeKamar() +
                    "\nHarga        : " + getDailyTariff() +
                    "\nStatus kamar : " + getStatusKamar();
        }
        else
        {
            return "\nNama hotel    : " + getHotel().getNama() +
                    "\nTipe kamar   : " + getTipeKamar() +
                    "\nHarga        : " + getDailyTariff() +
                    "\nStatus kamar : " + getStatusKamar() +
                    "\nPelanggan    : " + DatabasePesanan.getPesanan(this).getPelanggan().getNama();
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

