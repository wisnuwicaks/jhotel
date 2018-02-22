
/**
 * Write a description of class Pesanan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
  
    public Pesanan()
    {
        
    }
    
    public double getBiaya()
    {
        return biaya;
    }
    
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public boolean getStatusDiproses()
    {
        return false;
    }
    
    public boolean getStatusSelesai()
    {
        return false;
    }
    
    public void setPelanggan(Customer baru)
    {
        pelanggan=baru;
    }
    
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses=diproses;
    }
    
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai=diproses;
    }
    
  

   
}
