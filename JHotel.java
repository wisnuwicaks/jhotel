
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
        Customer customer1=new Customer(1,"Wisnu");
        Lokasi lokasi1 = new Lokasi (1,2, "Lokasi saya");
        Hotel hotel1 = new Hotel("Hotelku",lokasi1,5);
        Pesanan pesanan1= new Pesanan(5000,customer1);
        
        customer1.printData();
        hotel1.printData();
        pesanan1.printData();
        
        customer1.setNama("Gue");
        customer1.printData();
        hotel1.printData();
        pesanan1.printData();
        
    }
    public JHotel()
    {
        
        
    }
}
