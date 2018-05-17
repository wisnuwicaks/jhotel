package jhotel;
import java.util.ArrayList;
/**
 * Ini adalah kelas yang berfungsi untuk menyimpan data-data pelanggan dalam array.
 * Setiap customer yang mendaftar akan mendapatkan ID terurut diawali dari 1 dan seterusnya.
 * Kelas ini mengandung informasi mengenai object customer dan penanganan penambahan customer baru
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */

    public class DatabaseCustomer
    {
        private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
        private static int LAST_CUSTOMER_ID = 0;

        /**
         * method untuk membuat arraylist berisi customer
         *
         * @return CUSTOMER_DATABASE
         */
        public static ArrayList<Customer> getCustomerDatabase()
        {
            return CUSTOMER_DATABASE;
        }

        /**
         * untuk mendapatkan ID dari customer terakhir
         *
         * @return LAST_CUSTOMER_ID
         */
        public static int getLastCustomerID()
        {
            return LAST_CUSTOMER_ID;
        }

        /**
         * untuk menambahkan data customer.
         *
         * @return true
         */
        public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
        {
            for(Customer pelanggan : CUSTOMER_DATABASE)
            {
                if(pelanggan.getID() == baru.getID() ||
                        pelanggan.getEmail().equals(baru.getEmail()))
                {
                    throw new PelangganSudahAdaException(pelanggan);

                }
            }
            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getID();
            return true;
        }

        /**
         * untuk mendapatkan customer dengan id yang ditentukan
         *
         * @param id menentukan id customer
         * @return cust mengembalikan nilai customer jika memenuhi syarat
         * @return null jika nilai yang diambil dari array tidak memenuhi kondisi
         */
        public static Customer getCustomer(int id)
        {
            for (Customer cust : CUSTOMER_DATABASE)
            {
                if (cust.getID() == id)
                {
                    return cust;
                }
            }
            return null;
        }

        /**
         * untuk mendapatkan customer yang login menggunakan email dan passwordnya.
         *
         * @param email menentukan nilai email
         * @param password menentukan nilai password
         * @return cust mengembalikan nilai customer jika memenuhi syarat
         * @return null jika nilai yang diambil dari arraylist tidak memenuhi kondisi
         */
        public static Customer getCustomerLogin(String email, String password){
            for(Customer cust : CUSTOMER_DATABASE){
                if (cust.getEmail().equals(email) && cust.getPassword().equals(password))
                {
                    return cust;
                }
            }
            return null;
        }

        /**
         * untuk menghapus data customer.
         *
         * @return true
         */
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

        }


    }
    
