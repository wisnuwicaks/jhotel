
/**
 * Write a description of class Lokasi here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */
public class Lokasi
{
    
    // instance variable class Lokasi
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    //Ini adalah constuctor class Lokasi
    public Lokasi (float x_coord,float y_coord, String deskripsiLokasi)
    {
       this.x_coord=x_coord;
       this.y_coord=y_coord;
       this.deskripsiLokasi=deskripsiLokasi;
    }
    /*
     * Metode getX untuk mendapatkan nilai koordinat X
     */
    public float getX()
    {
       return x_coord;
    }
    /*
     * Metode getY untuk mendapatkan nilai koordinat Y
     */    
    public float getY()
    {
        return y_coord;   
    }
    /*
     * Metode getDiskripsi untuk menampilkan deskripsi lokasi
     * @return mengembalikan nilai ke variable deskripsiLokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;   
    }
    /*
     * Metode setX untuk mengeset nilai koordinat X
     */
    public void setX(float x_coord)
    {
        this.x_coord=x_coord;
    }
    /*
     * Metode setY untuk mengeset nilai koordinat Y
     */
    public void setY(float y_coord)
    {
        this.y_coord=y_coord;
    }
    /*
     * Metode setDeskripsi untuk mengeset deskripsi lokasi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi=deskripsi;
    }
    /*
     * Metode printDatauntuk menampilkan data lokasi
     */
    public void printData()
    {
        System.out.print("Deskripsi :" + deskripsiLokasi);
    }

    
}
