import java.util.ArrayList;
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Wisnu Wicaksono
 * @version 1.0
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }
    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }
    public static boolean addHotel(Hotel baru)
    {
        for(Hotel cari : HOTEL_DATABASE){
            if(baru.getID() == cari.getID()){
                return false;
            }
        }

        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        //DatabaseHotel.LAST_HOTEL_ID++;
        return true;
    }

    public static Hotel getHotel(int id)
    {
        for(Hotel cari : HOTEL_DATABASE)
        {
            if(cari.getID() == id)
            {
                return cari;
            }
        }

        return  null;
    }

    
    public static boolean removeHotel(int id)
    {
        for(Hotel cari1 : HOTEL_DATABASE){
            if(cari1.getID() == id)
            {
                for(Room cari2 : DatabaseRoom.getRoomsFromHotel(cari1))
                {
                    DatabaseRoom.removeRoom(cari1, cari2.getNomorKamar());
                }
                HOTEL_DATABASE.remove(cari1);
                return true;
            }
        }

        return false;
    }



    
}
