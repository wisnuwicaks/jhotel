package jhotel;
import java.util.ArrayList;
/**
 * Ini adalah kelas yang berfungsi menyimpan data pesanan Customer
 * Kelas ini menampung object kelas Pesanan dalam bentuk array list.
 * Setiap terdapat object hotel baru, maka akan ditambahkan ke database dalam bentuk array list dengan ID berdasarkan
 * urutan penambahan hotel tersebut.
 * DatabasePesanan juga menyimpan status aktif pesanan.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
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

    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == baru.getID())
            {
                if(pesanan.getStatusAktif() == true)
                {
                    throw new PesananSudahAdaException(pesanan);
                    //return false;
                }
                else
                {
                    LAST_PESANAN_ID = baru.getID();
                    PESANAN_DATABASE.add(baru);
                    return true;
                }
            }
        }
        LAST_PESANAN_ID = baru.getID();
        PESANAN_DATABASE.add(baru);
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

    public static Pesanan getPesananAktif(Room kamar)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if(pesan.getRoom().equals(kamar) && pesan.getStatusAktif()){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan)
    {

        for (Pesanan pesan : PESANAN_DATABASE)
            if (pesan.getStatusAktif() && pesan.getPelanggan().equals(pelanggan))
            {
                return pesan;
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
