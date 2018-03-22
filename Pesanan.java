import java.util.Date;
/**
 * Write a description of class Pesanan here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */
public class Pesanan
{
    //Ini adalah instace variable class Pesanan
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    
    //Ini adalah constuctor class Pesanan
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.pelanggan=pelanggan;
        this.jumlahHari=jumlahHari;
        this.kamar=kamar;
        this.biaya=(kamar.getDailyTariff())*jumlahHari;
        
    }
    
    
    /*
     * Ini adalah metode accessor untuk mendapatkan nilai biaya
     * @return biaya menyatakan besar biaya
     */
    public double getBiaya()
    {
        return biaya;
    }
    
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
    
    
    /*
     * Ini adalah metode untuk mendapatkan nilai varible isDiproses
     * @return isDiproses : untuk variable isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    /*
     * Ini adalah metode accessor untuk mendapatkan nilai variable isSelesai
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    
    public Room getRoom(){
        return kamar;
    }
    
    /*
     * Ini adalah metode mutator untuk mengeset besar biaya 
     * 
     */
    public void setBiaya()
    {
        this.biaya=(kamar.getDailyTariff())*jumlahHari;
        
    }
    
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari=jumlahHari;
    
    }
    /*
     * Ini adalah metode mutaor untuk mengassign data Customer baru
     * @param baru adalah parameter untuk assign pelanggan baru
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan=pelanggan;
    }
    
    
    /*
     * Ini adalah metode untuk mendapatkan nilai pelanggan
     * @return isDiproses untuk mengembalikan nilai variable isDiproses
     * @param diproses : parameter untuk instance variable diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
        
    }
    
    /*
     * Ini adalah metode mutator untuk mengassign status selesai
     * 
     */
    public void setStatusSelesai(boolean selesai)
    {
       isSelesai=selesai;
    }
    
    public void setRoom(Room kamar){
        this.kamar=kamar;
    }
    
    public void setTanggalPesan (Date tanggalPesan){
        this.tanggalPesan=tanggalPesan;
    }
    public String toString(){
        return null;
    }
    
    /*
     * Ini adalah metode untuk mencetak informasi mengenai pesanan
     * 
     */
    public void printData()
    {
        System.out.println("Pesanan");
        System.out.println("Nama Pelanggan :"+ pelanggan.getNama());
        System.out.println("Status layanan diproses :"+ isDiproses);
        System.out.println("Status layanan selesai :"+ isSelesai);
        System.out.println("Jumlah Hari :"+ jumlahHari);
        System.out.println("Biaya :"+ biaya);
    }
    
  
}
