package jhotel;
import java.util.ArrayList;
/**
 * Ini adalah kelas yang berfungsi menyimpan data informasi hotel dalam bentuk array list
 * Kelas ini menampung object Hotel dalam bentuk array list.
 * Setiap terdapat object Pesanan baru, maka akan ditambahkan ke DatabasePesanan bentuk array list dengan ID berdasarkan
 * urutan penambahan hotel tersebut.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * method untuk membuat arraylist berisi hotel
     * @return HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    /**
     * untuk mendapatkan ID dari hotel terakhir
     * @return LAST_HOTEL_ID
     */
    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }

    /**
     * untuk menambahkan data hotel.
     * @return true
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for(Hotel cari : HOTEL_DATABASE){
            if(baru.getID() == cari.getID() || baru.getNama().equals(cari.getNama())){
                throw new HotelSudahAdaException(baru);
            }
        }

        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        //DatabaseHotel.LAST_HOTEL_ID++;
        return true;
    }

    /**
     * untuk mendapatkan hotel dengan id yang ditentukan
     * @param id menerima passing nilai id hotel berupa integer
     * @return hotel bila memenuhi kondisi
     * @return null bila tidak memenuhi kondisi
     */
    public static Hotel getHotel(int id)
    {
        for(Hotel hotel : HOTEL_DATABASE)
        {
            if(hotel.getID() == id)
            {
                return hotel;
            }
        }

        return  null;
    }

    /**
     * untuk menghapus data hotel.
     *
     * @return true
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for(Hotel cari1 : HOTEL_DATABASE){
            if(cari1.getID() == id)
            {
                for(Room cari2 : DatabaseRoom.getRoomsFromHotel(cari1))
                {
                    try {
                        DatabaseRoom.removeRoom(cari1, cari2.getNomorKamar());
                    }
                    catch(RoomTidakDitemukanException cek){
                        System.out.println(cek.getPesan());
                    }
                }
                HOTEL_DATABASE.remove(cari1);
                return true;
            }
        }

        throw new HotelTidakDitemukanException(id);
    }



    
}
