import java.util.ArrayList;
/**
 * Menangani database pesanan
 *
 * @author Wisnu Wicaksono
 * @version 12 April 2018
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

    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException {
        for (Pesanan pesan : PESANAN_DATABASE)
        {
            if (pesan.getStatusAktif() && pesan.getID() == baru.getID()) {
                //return false;
                throw new PesananSudahAdaException(baru);
            }

        }
        PESANAN_DATABASE.add(baru);
        LAST_PESANAN_ID=baru.getID();
        return true;
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
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(kamar.equals(pesan.getRoom())==true){
                return pesan;
            }
        }
        return null;
    }
    
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (Pesanan pesan : PESANAN_DATABASE)
        {
            if (pesan.getStatusAktif() == true && pesan.getPelanggan().equals(pelanggan) == true)
            {
                return pesan;
            }
        }
        return null;
    }

    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        throw new PesananTidakDitemukanException(pesan.getPelanggan());
        //return false;
    }
    /*
    public static void pesananDibatalkan(Pesanan pesan)
    {

    }
    */
}
