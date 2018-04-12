import java.util.Date;
import java.text.*;
/**
 * Write a description of class Pesanan here.
 *
 * @author Wisnu Wicaksono
 * @version 12 April 2018
 */
public class Pesanan
{
    //Ini adalah instace variable class Pesanan
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    private int id;
    private Pesanan pesan;

    
    //Ini adalah constuctor class Pesanan
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.pelanggan=pelanggan;
        this.jumlahHari=jumlahHari;
        isAktif=true;
        tanggalPesan=new Date();
        //tanggalPesan = new Date(tahun,bulan,hari);
        //this.biaya=(kamar.getDailyTariff())*jumlahHari;
    }
    
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar, Date tanggalPesan){
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.tanggalPesan=tanggalPesan;
    
    }
    
    public int getID(){
        return id;
    }
    /*
     * Ini adalah metode accessor untuk mendapatkan nilai biaya
     * @return biaya menyatakan besar biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
    /*
     * Ini adalah metode accessor untuk mendapatkan nilai jumlahHari
     * @return biaya menyatakan besar biaya
     */
    public double getJumlahHari(){
        return jumlahHari;
    }
    
    /*
     * Ini adalah metode accessor untuk mendapatkan nilai pelanggan
     * @return pelanggan merupakan data pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    public boolean getStatusAktif(){
        return isAktif;
    }
    
    /*
     * Ini adalah metode untuk mendapatkan nilai varible isDiproses
     * @return isDiproses : untuk variable isDiproses
     */
    public boolean getStatusDiproses() {
        return isDiproses;
    }
    
    /*
     * Ini adalah metode accessor untuk mendapatkan nilai variable isSelesai
     * @return isSelesai
     */
    public boolean getStatusSelesai() {
        return isSelesai;
    }
     /*
     * Ini adalah metode accessor untuk mendapatkan nilai variable kamar
     * @return kamar
     */
    public Room getRoom(){
        return kamar;
    }
    
    public Date getTanggalPesan()
    {
        DateFormat df = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String hasil = df.format(tanggalPesan);
        System.out.println(hasil);
        return tanggalPesan;
    }
    public void setID (int id){
        this.id=id;
    }
    /*
     * Ini adalah metode mutator untuk mengeset besar biaya 
     * 
     */
    public void setBiaya() {
        this.biaya=(kamar.getDailyTariff())*jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari=jumlahHari;
    }
    /*
     * Ini adalah metode mutaor untuk mengassign data Customer baru
     * @param baru adalah parameter untuk assign pelanggan baru
     */
    public void setPelanggan(Customer pelanggan) {
        this.pelanggan=pelanggan;
    }
    
    public void setStatusAktif(boolean aktif){
        this.isAktif=aktif;
    }
    /*
     * Ini adalah metode untuk mendapatkan nilai pelanggan
     * @return isDiproses untuk mengembalikan nilai variable isDiproses
     * @param diproses : parameter untuk instance variable diproses
     */
    public void setStatusDiproses(boolean diproses) {
        isDiproses=diproses;
    }
    
    /*
     * Ini adalah metode mutator untuk mengassign status selesai
     * 
     */
    public void setStatusSelesai(boolean selesai) {
        isSelesai=selesai;
    }
    
    public void setRoom(Room kamar){
        this.kamar=kamar;
    }
    
    public void setTanggalPesan (Date tanggalPesan){
        this.tanggalPesan=tanggalPesan;
    }
   
    
    public String toString()
        {
            String final_status = "KOSONG";
            if(isDiproses == true && isSelesai==false){
            final_status="DIPROSES";
        }
        else if(isDiproses==false && isSelesai==false){
            final_status="KOSONG";
            }
         else if(isDiproses==false && isSelesai==true){
            final_status="SELESAI";
        }
        return "Dibuat oleh "+pelanggan.getNama()+
               "Proses booking untuk"+kamar.getHotel()+
               "kamar nomor "+kamar.getNomorKamar()+
               ".Status : "+final_status+".";
    }
    
    /*
     * Ini adalah metode untuk mencetak informasi mengenai pesanan
     * 
     */
    /*
    public void printData()
    {
        System.out.println("Pesanan");
        System.out.println("Nama Pelanggan :"+ pelanggan.getNama());
        System.out.println("Status layanan diproses :"+ isDiproses);
        System.out.println("Status layanan selesai :"+ isSelesai);
        System.out.println("Jumlah Hari :"+ jumlahHari);
        System.out.println("Biaya :"+ biaya);
    }
    */
   
}
