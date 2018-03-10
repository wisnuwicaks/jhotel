
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
        Lokasi lokasi1 = new Lokasi (20,20, "Depok");
        Customer customer1 = new Customer(15299,"Wisnu");
        Hotel hotel1 = new Hotel("Hotelku",lokasi1,5);
        Room room1 = new Room(hotel1,"66",true,customer1,1000000,StatusKamar.BOOKED);
        Pesanan pesanan1= new Pesanan(1000000,customer1);
        
        pesanan1.setTipeKamar(TipeKamar.PREMIUM);
        
        System.out.println("Welcome to JHotel");
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        System.out.println("==================METHOD 1===================="); 
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room1.printData();
        pesanan1.printData();
        
        System.out.println("==================METHOD 2====================");
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

        
    }
    //constructor class JHotel
    public JHotel()
    {
        
        
    }
}
