import java.util.ArrayList;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */

    public class DatabaseCustomer
    {
        private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
        private static int LAST_CUSTOMER_ID = 0;

        public static ArrayList<Customer> getCustomerDatabase()
        {
            return CUSTOMER_DATABASE;
        }

        public static int getLastCustomerID()
        {
            return LAST_CUSTOMER_ID;
        }

        public static boolean addCustomer(Customer baru)
        {
            for(Customer cust : CUSTOMER_DATABASE){
                if(baru.getID() == cust.getID()){
                    return false;
                }
            }

            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getID();
            return true;
        }

        public static Customer getCustomer(int id){
            for (Customer cust :
                    CUSTOMER_DATABASE) {
                if (cust.getID() == id) return cust;
            }
            return null;
        }

        public static boolean removeCustomer(int id)
        {
            for(Customer cust : CUSTOMER_DATABASE)
            {
                if(cust.getID() == id)
                {
                    for(Pesanan cari2 : DatabasePesanan.getPesananDatabase()){
                        if(cari2.getPelanggan().equals(cust))
                        {
                            DatabasePesanan.removePesanan(cari2);
                        }
                    }

                    CUSTOMER_DATABASE.remove(cust);
                    return true;
                }
            }

            return false;
        }


    }
    
