package jhotel;
/**
 * Ini adalah kelas yang berfungsi untuk menginisasi data Hotel.
 * Kelas Hotel akan membuat object berupa nama, lokasi, bintang hotel.
 * Kelas ini juga berfungsi mencetak setiap kalo ingin ditampilkan mengenai object Hotel.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class Hotel
{
   
    
    // instance variables - replace the example below with your own
      private String nama;
      private Lokasi lokasi;
      private int bintang;
      private int id;
     /**
     * Constructor for objects of class Hotel.
     * 
     * @param nama  untuk menentukan nama hotel
     * @param lokasi  untuk menentukan lokasi hotel
     * @param bintang  untuk menentukan hotel bintang berapa
     */
      public Hotel(String nama, Lokasi lokasi, int bintang)
      {
          this.nama=nama;
          this.lokasi=lokasi;
          this.bintang=bintang;
          this.id = DatabaseHotel.getLastHotelID() + 1;
      }
    public int getID()
    {
        return id;
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
      public void setID(int id)
      {
          this.id=id;
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

    public String toString()
    {
        return "Nama Hotel \t\t:" + getNama() +
                "\nBintang Hotel \t\t:" + getBintang()+
                "\nLokasi Hotel \t\t:" + getLokasi().getDeskripsi()+"\n\n";
    }
      
      
      /*
      public void printData()
      {
          System.out.println("Hotel");
          System.out.println("Nama hotel :" + nama);
          System.out.println("Lokasi :" + lokasi.getDeskripsi());
          System.out.println("Bintang :" + bintang);
          
      }
      */
      
}
