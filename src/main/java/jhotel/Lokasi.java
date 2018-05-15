package jhotel;

/**
 * Ini adalah kelas yang berfungsi untuk menyimpan data lokasi Hotel.
 * Lokasi hotel terdiri dari koordinat X dan Y serta deskripsi Lokasi.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
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
     * @return x_coord mengembalikan nilai koordinat X
     */
    public float getX()
    {
       return x_coord;
    }

    /*
     * Metode getY untuk mendapatkan nilai koordinat Y
     * @return x_coord mengembalikan nilai koordinat Y
     */    
    public float getY()
    {
        return y_coord;   
    }

    /*
     * Metode getDiskripsi untuk menampilkan deskripsi lokasi
     * @return deskripsi mengembalikan nilai ke variable deskripsiLokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;   
    }

    /*
     * Metode setX untuk mengeset nilai koordinat X
     * @param x_coord variable untuk mengeset nilai koordinat x ke class variabel x_coord
     */
    public void setX(float x_coord)
    {
        this.x_coord=x_coord;
    }

    /*
     * Metode setY untuk mengeset nilai koordinat Y
     * @param y_coord variable lokal untuk dipassing class variale y_coord
     */
    public void setY(float y_coord)
    {
        this.y_coord=y_coord;
    }

    /*
     * Method mutator untuk mengeset deskripsi lokasi
     * @param deskripsi adalah variable lokal unutk dipassing ke class variable deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi=deskripsi;
    }

    /*
     * Metode untuk menampilakn nilai object dalam betuk String
     */
    public String toString(){
        return "\nKoordinat X       : "+ getX()+
               "\nKoordinat Y       : "+ getY()+
               "\nDeskripsi lokasi  : "+ getDeskripsi();
    }
    
  
    /*
    public void printData()
    {
        System.out.println("Lokasi");
        System.out.println("Koordinat x :" + x_coord);
        System.out.println("Koordinat y :" + y_coord);
        System.out.println("Deskripsi :" + deskripsiLokasi);
    }
    */

    
}
