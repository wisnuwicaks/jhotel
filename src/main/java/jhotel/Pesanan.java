package jhotel;
import java.util.Date;

/**
 * Ini adalah kelas yang digunakan untuk membuat object Pesanan.
 * Object Pesanan terdiri jumlah hari dan object customer.
 *
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class Pesanan
{
    //Ini adalah instace variable class Pesanan
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    //default construtor
    public Pesanan()
    {

    }
    /** Constructor object kelas Room
     * @param jumlahHari banyaknya hari yang dipesan
     * @param pelanggan variable tipe object dari kelas Customer yang menyimoan data cusotmer
     */

    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.pelanggan=pelanggan;
        this.jumlahHari=jumlahHari;
        isAktif=true;
        tanggalPesan = new Date();
        this.id= DatabasePesanan.getLastPesananID() + 1;

    }

    /*
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, Date tanggalPesan)
    {
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.tanggalPesan=tanggalPesan;
    }
    */

    /**
     *Merupakan accessor untuk mendapatkan nilai id dari object Pesanan
     * @return id mengembalikan nilai id
     */
    public int getID()
    {
        return id;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan nilai biaya
     * @return biaya mengembalikan nilai besar biaya
     */
    public double getBiaya()
    {
        return biaya;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan nilai jumlahHari
     * @return jumlahHari mengembalikan nilai banyaknya jumlah hari
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    
    /**
     * Ini adalah method accessor untuk mendapatkan isi object Customer
     * @return pelanggan mengembalikan oject Customer ke variable pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan status pesanan aktif
     * @return isAktif mengembalikan status apakah aktif atau tidak dari suatu pesanan
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }
    
    /**
     * Ini adalah method accessor untuk mendapatkan nilai status diproses suatu pesanan
     * @return isDiproses mengembalikakan nilai suatu pesanan apakah sedang diproses atau tidak
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /**
     * Ini adalah metod accessor untuk mendapatkan nilai status selesai suatu pesanan
     * @return isSelesai mengembalikan apakah status pesanan sudah selesai atau blum
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan object Room
     * @return kamar mengembalikan nilai object Room ke dalam variabel kamar
     */
    public Room getRoom()
    {
        return kamar;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan tanggal pemesanan kamar dari object Date
     * @return tanggalPesan mengembalikan nilai berupa tanggal pemesanan
     */
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

    /**
     * Ini adalah metode mutator untuk mengeset ID suatu pesanan
     * @param id variabel unutk menyimpan id suatu pesanan
     *
     */
    public void setID (int id)
    {
        this.id=id;
    }

    /*
     * Ini adalah metode mutator untuk mengeset biaya suatu pesanan
     * dan menyimpannya pada varibel biaya
     *
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff() * jumlahHari;
    }

    /**
     * Ini adalah method mutator untuk mengeset jumlah hari yang dipesan
     * @param jumlahHari variabel unutk menyimpan jumlah hari yang dipesan
     *
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari=jumlahHari;
    }

    /**
     * Ini adalah method mutaor untuk mengassign Customer baru
     * @param pelanggan adalah parameter untuk assign pelanggan dengan tipe object Customer
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan=pelanggan;
    }

    /**
     * Ini adalah method mutaor untuk mengassign Customer baru
     * @param aktif adalah parameter untuk menyimpan nilai status aktif suatu pesanan
     * untuk dipassing ke variable isAktif.
     */
    public void setStatusAktif(boolean aktif)
    {
        isAktif=aktif;
    }

    /**
     * ini adalah method mutator untuk mengeset nilai status dipeoses dari pesanan
     * @param diproses parameter variable lokal untuk dipassing ke variable global isDiproses
     * @return isDiproses untuk mengembalikan nilai variable isDiproses
     *
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
    }
    
    /**
     * Ini adalah metode mutator untuk mengassign status selesai suatu pesanan
     * @param selesai adalah variabel lokal untuk dipasing ke instance variable isSelesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai=selesai;
    }

    /**
     * Ini adalah metode mutator untuk mengassign object Room
     * @param kamar adalah variabel lokal untuk dipasing ke instance variable kamar
     */
    public void setRoom(Room kamar)
    {
        this.kamar=kamar;
    }

    /**
     * Ini adalah metode mutator untuk mengassign tanggal suatu pesanan
     * @param tanggalPesan variable untuk menyimpan tanggal pesan pemesanan
     */
    public void setTanggalPesan (Date tanggalPesan){
        this.tanggalPesan=tanggalPesan;
    }

    /*
     * Ini adalah metode mencetak oject ke dalam bentuk string
     *
     */
    public String toString()
    {

        String final_status = "KOSONG";
        if(this.isDiproses && !this.isSelesai){
            final_status = "DIPROSES";
        }
        else if(!this.isDiproses && !this.isSelesai){
            final_status = "KOSONG";
        }
        else if(!this.isDiproses && this.isSelesai){
            final_status = "SELESAI";
        }

        if(kamar != null){
            return "Dibuat oleh " + getPelanggan().getNama()
                    + ". Proses booking untuk " + getRoom().getHotel().getNama()
                    + " kamar nomor " + getRoom().getNomorKamar()
                    + " dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString()
                    + ". Status: " + final_status + ".\n";
        } else{
            return "Dibuat oleh " + getPelanggan().getNama()
                    + ". Proses booking null "
                    + "kamar nomor null "
                    + "dengan tipe kamar yang diinginkan null "
                    + ". Status: " + final_status + ".\n";
        }

    }

   
}
