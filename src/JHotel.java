import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Write a description of class JHotel here.
 *
 * @author Wisnu Wicaksono
 * @version  21 April 2018
 */
public class JHotel
{
    public static void main (String args[])
    {
        try {
            DatabaseCustomer.addCustomer(new Customer("Wisnu", 1900, 1, 9, "wisnu@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Wicak", 2000, 3, 4, "wicak@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Sono", 2018, 6, 10, "sono@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Sono", 2018, 6, 10, "sono@gmail.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println("---TES PELANGGAN SUDAH ADA---");
            System.out.println(e.getPesan());
        }

        try {
            Lokasi a = new Lokasi(102, 320, "Depok City");
            DatabaseHotel.addHotel(new Hotel("AHotel", new Lokasi(3, 3, "Bandung City"), 5));
            DatabaseHotel.addHotel(new Hotel("BHotel", new Lokasi(10, 10, "Medan City"), 100));
            DatabaseHotel.addHotel(new Hotel("CHotel", a, 1));
            DatabaseHotel.addHotel(new Hotel("CHotel", a, 1));
        } catch(HotelSudahAdaException e){
            System.out.println("---TES HOTEL SUDAH---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "K101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "S202"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "GK303"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "K306"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "K306"));

        } catch(RoomSudahAdaException e){
            System.out.println("---TES ROOM SUDAH ADA---");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(10, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(11, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(12, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(11, DatabaseCustomer.getCustomer(3)));
        } catch(PesananSudahAdaException e){
            System.out.println("---TES PESANAN SUDAH ADA---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(100);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("---TES PELANGGAN TIDAK DITEMUKAN---");
            System.out.println(e.getPesan());
        }
        Customer cust = new Customer("Ayeee",1900,5,21,"Ayeee@gmail.com");
        Pesanan pesan = new Pesanan(32,cust);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("---TES PESANAN TIDAK DITEMUKAN---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(29);
        } catch(HotelTidakDitemukanException e){
            System.out.println("---TES HOTEL TIDAK DITEMUKAN---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"K1000");
        } catch(RoomTidakDitemukanException e){
            System.out.println("---TES ROOM TIDAK DITEMUKAN---");
            System.out.println(e.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());
        /*
        System.out.println("\n\nTry-Catch 1 \n");


        Customer A = new Customer("Wisnu", 2018, 4,2, "wicak@gmail.com");
        try
        {
            DatabaseCustomer.addCustomer(A);
        }
        catch(PelangganSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Customer B = new Customer("Wisnu Wicaksono", 2016, 4,18, "wisnu@ymail.com");
        try
        {
            DatabaseCustomer.addCustomer(B);
        }
        catch(PelangganSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Customer C = new Customer("Wisnu Wicaks", 2010, 4,19, "wisnu_wiacak@ymail.com");
        try
        {
            DatabaseCustomer.addCustomer(C);
            DatabaseCustomer.addCustomer(C);
        }
        catch(PelangganSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 2 \n");

        Pesanan pesan1 = new Pesanan(69, A);
        pesan1.setStatusAktif(true);
        try
        {
            DatabasePesanan.addPesanan(pesan1);
        }
        catch (PesananSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Pesanan pesan2 = new Pesanan(13, B);
        pesan2.setStatusAktif(true);
        try
        {
            DatabasePesanan.addPesanan(pesan2);
        }
        catch (PesananSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Pesanan pesan3 = new Pesanan(45, C);
        pesan3.setStatusAktif(true);
        try
        {
            DatabasePesanan.addPesanan(pesan3);
            DatabasePesanan.addPesanan(pesan3);
        }
        catch (PesananSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }



        System.out.println("\n\nTry-Catch 3 \n");


        Lokasi test1 = new Lokasi(1, 2 , "Depok City");
        Lokasi test2 = new Lokasi(3, 4, "Jakarta City");
        Lokasi test3 = new Lokasi(5, 6, "Bandung City");
        Lokasi test4 = new Lokasi(7, 8, "Medan City");

        Hotel D = new Hotel("Depok Hotel", test1, 5);
        try
        {
            DatabaseHotel.addHotel(D);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Hotel E = new Hotel("Jakarta Hotel", test2, 4);
        try
        {
            DatabaseHotel.addHotel(E);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Hotel F = new Hotel("Bandung Hotel", test3, 3);
        try
        {
            DatabaseHotel.addHotel(F);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Hotel G = new Hotel("Medan Hotel", test4, 3);
        try
        {
            DatabaseHotel.addHotel(G);
            DatabaseHotel.addHotel(D);
        }
        catch (HotelSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }



        System.out.println("\n\nTry-Catch 4 \n");


        Room A101 = new SingleRoom(D, "A101");
        try
        {
            DatabaseRoom.addRoom(A101);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Room D404 = new PremiumRoom(D, "D404");
        try
        {
            DatabaseRoom.addRoom(D404);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Room B202 = new DoubleRoom(E, "B202");
        try
        {
            DatabaseRoom.addRoom(B202);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        Room C303 = new PremiumRoom(F, "C303");
        try
        {
            DatabaseRoom.addRoom(C303);
            DatabaseRoom.addRoom(A101);
        }
        catch (RoomSudahAdaException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 5 \n");

        try
        {
            DatabaseCustomer.removeCustomer(1);
            DatabaseCustomer.removeCustomer(1);
        }
        catch (PelangganTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\nTry-Catch 6 \n");

        try
        {
            DatabaseHotel.removeHotel(1);
            DatabaseHotel.removeHotel(2);
            DatabaseHotel.removeHotel(3);
        }
        catch (HotelTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\nTry-Catch 7 \n");

        try
        {
            DatabaseRoom.removeRoom(D, "D404");
            DatabaseRoom.removeRoom(F, "A303");
        }
        catch (RoomTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 8 \n");

        try
        {
            DatabasePesanan.removePesanan(pesan1);
        }
        catch (PesananTidakDitemukanException a)
        {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\n---  Hasil Akhir Pesanan  --- \n");
        System.out.println(DatabasePesanan.getPesananDatabase());
        System.out.println("\n\n---  Hasil Akhir Customer  --- \n");
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println("\n\n---  Hasil Akhir Room  --- \n");
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println("\n\n---  Hasil Akhir Hotel  --- \n");
        System.out.println(DatabaseHotel.getHotelDatabase());
        /*

        DatabaseCustomer.addCustomer(new Customer("a",1990,1,2));
        DatabaseCustomer.addCustomer(new Customer("b",1991,3,4));
        DatabaseCustomer.addCustomer(new Customer("c",1992,5,6));
        for(Customer print : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(print);
        }
        //Hotel D = new Hotel("Alexis", test1, 5);

        //Lokasi Lokasi1 = new Lokasi(2,3,"Lokasi1")
        //Lokasi Lokasi2 = new Lokasi(2,3,"Lokasi1")
        //Lokasi Lokasi3 = new Lokasi(2,3,"Lokasi1")
        DatabaseHotel.addHotel(new Hotel("Alexis",new Lokasi(2,3,"Depok"),5));
        DatabaseHotel.addHotel(new Hotel("BHotel",new Lokasi(2,3,"Kukusan"),5));
        DatabaseHotel.addHotel(new Hotel("CHotel",new Lokasi(2,3,"Beji"),5));
        for(Hotel print : DatabaseHotel.getHotelDatabase()){
            System.out.println(print);
        }
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"A1"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2),"B2"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3),"C3"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1),"D4"));

        for(Room print : DatabaseRoom.getRoomDatabase()){
           System.out.println(print);
        }
        DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(4, DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(3)));

        for(Pesanan pesan : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesan + "\n");
        }
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"A1"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(2),"B2"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"D4"));

        for( Pesanan print : DatabasePesanan.getPesananDatabase() )
        {
            System.out.print(print);
        }

        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));
        for( Pesanan print : DatabasePesanan.getPesananDatabase() )
        {
            System.out.print(print);
        }
        */
        //DatabasePesanan.addPesanan(new Pesanan(45, DatabaseCustomer.getCustomer()));
        //System.out.println(DatabasePesanan.getPesananDatabase());

        //Room A101 = new SingleRoom(D, "A101", StatusKamar.VACANT);
        //DatabaseRoom.addRoom(A101);
        //Room D404 = new PremiumRoom(D, "B2", StatusKamar.VACANT);
        //DatabaseRoom.addRoom(D404);
        //System.out.println(DatabaseHotel.getHotelDatabase());
        //System.out.print(DatabaseCustomer.getCustomer(1).toString());
        //System.out.print(DatabaseCustomer.getCustomer(2).toString());
        //System.out.print(DatabaseCustomer.getCustomer(3).toString());

        /*
        Lokasi lokasi1 = new Loka(20,20, "Depok");
        Customer customer1 = new Customer(15299,"Wisnu");
        Hotel hotel1 = new Hotel("Hotelku",lokasi1,5);
        Room room1 = new SingleRoom(hotel1,"222",true,StatusKamar.VACANT);
        room1.setDailyTariff(3000000);
        Pesanan pesanan1= new Pesanan(3,customer1,room1);
        
        //pesanan1.setTipeKamar(TipeKamar.PREMIUM);
     
        System.out.println("Welcome to JHotel");
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        System.out.println("==================METHOD 1===================="); 
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room1.printData();
        pesanan1.printData();
        
        /*System.out.println("==================METHOD 2====================");
        Administrasi.pesananDibatalkan(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 3====================");
        Administrasi.pesananDibatalkan(pesanan1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 4====================");
        Administrasi.pesananSelesai(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 5====================");
        Administrasi.pesananSelesai(pesanan1);
        room1.printData();
        pesanan1.printData();
        */
        
        
    }
    //constructor class JHotel
    public JHotel()
    {
        
        
    }
}
