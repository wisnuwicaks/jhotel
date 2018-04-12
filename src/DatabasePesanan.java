import java.util.ArrayList;
/**
 * Menangani database pesanan
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;
    //private static String[] list_pesanan;

    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID ()
    {
        return LAST_PESANAN_ID;
    }
    public static boolean addPesanan(Pesanan baru)
    {
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif())
            {
                return false;
            }
            else
            {
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else
        {
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }

    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == id)
            {
                return pesanan;
            }
        }

        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar))
            {
                return pesanan;
            }
        }

        return null;
    }
    
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan))
            {
                if(pesanan.getStatusAktif())
                {
                    return pesanan;
                }
            }
        }

        return null;
    }

    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    /*
    public static void pesananDibatalkan(Pesanan pesan)
    {

    }
    */
}
