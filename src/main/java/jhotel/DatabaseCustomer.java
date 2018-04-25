package jhotel;
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

        public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
        {
            for(Customer pelanggan : CUSTOMER_DATABASE)
            {
                if(pelanggan.getID() == baru.getID() ||
                        pelanggan.getEmail().equals(baru.getEmail()))
                {
                    throw new PelangganSudahAdaException(pelanggan);
                    //return false;
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

        public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
        {
            for(Customer pelanggan : CUSTOMER_DATABASE)
            {
                if(pelanggan.getID() == id)
                {
                    try
                    {
                        DatabasePesanan.removePesanan(
                                DatabasePesanan.getPesananAktif(pelanggan));
                    }
                    catch(PesananTidakDitemukanException a)
                    {
                        throw new PelangganTidakDitemukanException(id);
                    }

                    if(CUSTOMER_DATABASE.remove(pelanggan))
                    {
                        return true;
                    }
                }
            }

            throw new PelangganTidakDitemukanException(id);
            //return false;
        }


    }
    
