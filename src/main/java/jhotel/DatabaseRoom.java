package jhotel;
import java.util.ArrayList;
/**
 * Ini adalah kelas yang berfungsi menyimpan data object dari kelas Room
 * Kelas ini menampung object kelas Room dalam bentuk array list.
 * Setiap terdapat object Room baru, maka akan ditambahkan ke DatabaseRoom dalam bentuk array list.
 * Informasi yang disimpan adalah sesuai isi object Room yaitu nomor kamar dan id hotel.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    /**
     * membuat arraylist berisi room
     *
     * @return ROOM_DATABASE
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    /**
     * menambahkan database room
     * @param baru berisi objek Room
     */
    public static boolean addRoom (Room baru) throws RoomSudahAdaException {

            for (Room kamar : ROOM_DATABASE) {
                if (kamar.getHotel() == baru.getHotel() && kamar.getNomorKamar() == baru.getNomorKamar()) {

                    throw new RoomSudahAdaException(baru);
                }
            }

            ROOM_DATABASE.add(baru);
            return true;
    }
    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar))
            {
                return kamar;
            }
        }

        return null;
    }
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }
    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
                ROOM_DATABASE.remove(kamar);
                return true;

            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
    }


}
