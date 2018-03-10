
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
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
    //Ini adalah constuctor class Pesanan
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya=biaya;
        this.pelanggan=pelanggan;
        nama_pelanggan=pelanggan.getNama();
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
     * Ini adalah metode accessor untuk mendapatkan nilai pelanggan
     * @return pelanggan merupakan data pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public String getNamaPelanggan(){
        return nama_pelanggan;
    }
    
    public TipeKamar getTipeKamar (){
        return tipe_kamar;
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
    public void setBiaya(double biaya)
    {
        this.biaya=biaya;
        
    }
    
    /*
     * Ini adalah metode mutaor untuk mengassign data Customer baru
     * @param baru adalah parameter untuk assign pelanggan baru
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan=pelanggan;
    }
    
    public void setNamaPelanggan (String nama_pelanggan){
        this.nama_pelanggan=nama_pelanggan;
    }
    
    public void setTipeKamar (TipeKamar tipe_kamar){
        this.tipe_kamar=tipe_kamar;
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
    
    /*
     * Ini adalah metode untuk mencetak informasi mengenai pesanan
     * 
     */
    public void printData()
    {
        System.out.println("Pesanan");
        System.out.println("Nama pelanggan :"+ nama_pelanggan);
        System.out.println("Tipe kamar :"+ tipe_kamar);
        System.out.println("Status layanan diproses :"+ isDiproses);
        System.out.println("Status layanan selesai :"+ isSelesai);
    }
    
  
}
