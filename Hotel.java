
/**
 * Write a description of class Hotel here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */
public class Hotel
{
   
    
    // instance variables - replace the example below with your own
      private String nama;
      private Lokasi lokasi;
      private int bintang;
      
     /**
     * Constructor for objects of class Hotel.
     * 
     * @param nama : untuk menentukan nama hotel
     * @param lokasi : untuk menentukan lokasi hotel
     * @param bintang : untuk menentukan hotel bintang berapa
     */
    
      public Hotel(String nama, Lokasi lokasi, int bintang)
      {
          this.nama=nama;
          this.lokasi=lokasi;
          this.bintang=bintang;
      }
      
     /**
     * method getBintang
     * 
     * @return bintang : untuk mengembalikan nilai bintang

     */
      public int getBintang()
      {
          return bintang;
      }
      
      public String getNama()
      {
          return nama;
      }
      
      public Lokasi getLokasi()
      {
          return lokasi;
      }
      
      public void setNama(String nama)
      {
          this.nama=nama;
      }
      
      public void setLokasi(Lokasi lokasi)
      {
          this.lokasi=lokasi;
      }
      
      public void setBintang(int bintang)
      {
          this.bintang=bintang;
      }
      
      public void printData()
      {
          System.out.println("Hotel");
          System.out.println("Nama hotel :" + nama);
          System.out.println("Lokasi :" + lokasi.getDeskripsi());
          System.out.println("Bintang :" + bintang);
          
      }
      
}
