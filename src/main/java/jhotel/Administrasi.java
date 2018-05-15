package jhotel;
/**
 * Ini adalah kelas yang berfungsi untuk mengatur perihal administrasi
 * yaitu pemesanan, pembatalan dan dan penyelesaian kamar hotel.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class Administrasi
{

    /**
     * method ini digunakan untuk membuat pesanan kamar dan mengeset kamar menjadi booked
     * @param pesan parameter untuk menerima object room
     * @param kamar parameter untuk menerima object pesanan
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        if(pesan != null && kamar != null)
        {
            if(kamar.getStatusKamar() == StatusKamar.VACANT)
            {
                pesan.setStatusSelesai(false);
                pesan.setStatusDiproses(true);
                pesan.setRoom(kamar);
                kamar.setStatusKamar(StatusKamar.BOOKED);
                //roomAmbilPesanan(pesan, kamar);
            }
            else
            {
                pesan.setStatusAktif(false);
            }

        }
    }

    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }


    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
    }
    /*

    /**
     * method ini digunakan untuk membatalkan suatu pesanan
     * @param kamar parameter untuk menerima object Room dan membuat room menjadi vacant
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //roomLepasPesanan(kamar);
    }

    /**
     * method ini dijalankan bila status pesanan telah selesai dan akan mengeset kamar menjadi vacant
     * @param kamar untuk menerima object berupa Room
     */
    public static void pesananSelesai(Room kamar)
    {
        //Pesanan pesan = new Pesanan();
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        kamar.setStatusKamar(StatusKamar.VACANT);

        //roomLepasPesanan(kamar);
    }

    /**
     * method ini dijalankan bila pesanan dibatalakan dan
     * @param pesan untuk menerima object Pesanan yang dipassing
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        //roomLepasPesanan(pesan.getRoom());
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);

    }

    /**
     * Method ini dijalankan bila pesanan status sudah selesai
     * @param pesan menerima object berupa Pesanan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        //roomLepasPesanan(pesan.getRoom());
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);

    }

}
