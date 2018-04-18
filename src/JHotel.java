import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Write a description of class JHotel here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */
public class JHotel
{
    public static void main (String args[])
    {
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
