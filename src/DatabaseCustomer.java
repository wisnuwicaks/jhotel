import java.util.ArrayList;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */

    public class DatabaseCustomer
    {
        private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
        private static int LAST_CUSTOMER_ID = 0;

        
        public static boolean addCustomer(Customer baru)
        {
            for(Customer cari : CUSTOMER_DATABASE){
                if(baru.getID() == cari.getID()){
                    return false;
                }
            }

            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getID();
            return true;
        }
        
        public static boolean removeCustomer(int id)
        {
            for(Customer cari : CUSTOMER_DATABASE){
                if(cari.getID() == id){
                    for(Pesanan cari2 : DatabasePesanan.getPesananDatabase()){
                        if(cari2.getPelanggan() == cari){
                            DatabasePesanan.removePesanan(cari2);
                        }
                    }

                    CUSTOMER_DATABASE.remove(cari);
                    return true;
                }
            }

            return false;
        }
        
        public static String[] getCustomerDatabase(int id)
        {
            for(Customer cari : CUSTOMER_DATABASE){
                if(cari.getID() == id){
                    return cari;
                }
            }

            return null;
        }

        public static ArrayList<Customer> getCustomerDatabase()
        {
            return CUSTOMER_DATABASE;
        }

        public static int getLastCustomerID()
        {
            return LAST_CUSTOMER_ID;
        }
    }
    
