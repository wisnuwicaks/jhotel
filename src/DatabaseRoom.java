import java.util.ArrayList;
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author Wisnu Wicaksono
 * @version 12 April 2018
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    public static boolean addRoom (Room baru)
    {
        if(baru.getHotel() != null) {
            for (Room kamar : ROOM_DATABASE) {
                if(kamar.getHotel().equals(baru.getHotel()))
                {
                    if(baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0)
                    {
                        return false;
                    }
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        }
        else return false;
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
        ArrayList<Room> tempRoom = new ArrayList<>();

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

    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
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
        return false;
    }


}
