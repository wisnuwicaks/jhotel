package jhotel;
import java.util.Date;
import java.util.regex.*;
import java.util.*;
import java.text.*;
/**
 * Ini adalah kelas yang berfungsi untuk mengatur perihal customer
 * yaitu menyimpan nama, tanggal lahir, email, passowrd serta ID customer.
 * Kelas customer juga berfungsi untuk mencetak atau menampilkan informasi
 * mengenai object Customer setiap kali diperlukan.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public class Customer
{
    
    // instance variables class Customer
    private int id;
    private String nama;
    private String email;
    private Date dob;
    private String password;
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    /**
     * Constructor dari class Customer.
     *
     * @param nama  nama pelanggan
     * @param tanggal  tanggal lahir pelanggan
     * @param bulan  bulan lahir pelanggan
     * @param tahun  tahun lahir pelanggan
     */
    public Customer(String nama, int tahun, int bulan, int tanggal, String email, String password)
    {
        this.id=DatabaseCustomer.getLastCustomerID() + 1;
        this.nama=nama;
        this.dob = new GregorianCalendar(tahun, bulan-1, tanggal+1).getTime();
        this.email=email;
        this.password=password;
    }

    /**
     * Constructor dari class Customer.
     *
     * @param nama nama pelanggan
     * @param dob  tanggal lahir pelanggan dalam forma Date
     * @param email email pelanggan
     * @param password lahir pelanggan
     */
    public Customer(String nama, Date dob, String email, String password){
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
        this.password=password;
    }

    /**
     * Ini adalah method accessor untuk mendapatkan nilai id customer
     * @return id mengembalikan nilai id customer
     */
    public int getID()
    {
        return id;
    }

    /**
     * Method ini untuk mendapatkan nama customer
     * @return nama untuk mengembalikan nilai nama customer
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Method ini untuk mendapatkan email customer
     * @return email untuk mengembalikan nilai nama customer
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Method ini untuk mendapatkan dob customer
     * @return dob untuk mengembalikan nilai dob customer
     */
    public Date getDOB()
    {
        return dob;
    }

    /**
     * Method ini untuk mendapatkan password customer
     * @return password untuk mengembalikan nilai password customer
     */
    public String getPassword(){
        return password;
    }

    /**
     * Method ini digunakan untuk mengeset nilai id customer
     * @param id untuk menerima passing niilai id.
     */
    public void setID(int id)
    {
        this.id=id;  
    }

    /**
     * Method ini digunakan untuk mengeset nama customer
     * @param nama adalah parameter untuk menerima nama customer
     */
    public void setNama(String nama)
    {
        this.nama=nama;  
    }

    /**
     * Method ini digunakan untuk mengeset email dengan ketentuan sesuai regex
     * @param email adalah parameter untuk menerima email customer
     */
    public void setEmail(String email)
    {
               
        String pattern = 
        "^[_&*_~A-Za-z0-9-\\+]+(\\.[_&*_~A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if (m.matches())
        {
            this.email = email;
        }
        else
        {
            System.out.println("Email tidak valid");
        }
       
    }

    /**
     * Method ini digunakan untuk mengeset dob customer
     * @param dob adalah parameter untuk menerima dob customer
     */
    public void setDOB(Date dob)
    {   
        this.dob=dob;
    }

    /**
     * Method ini digunakan untuk mengeset password customer
     * @param password adalah parameter untuk menerima password customer
     */
    public void setPassword(String password){
        this.password=password;
    }

    /**
     * Method ini digunakan untuk menampilkan data dalam object maupun variable dalam bentuk String
     */
    public String toString()
    {
            if (DatabasePesanan.getPesananAktif(this)!=null)
            {
            return "\nCustomer ID       : "+getID()+
                   "\nNama              : "+getNama()+
                   "\nEmail             : "+getEmail()+
                   "\nDate of Birth     : "+dobformat.format(getDOB())+
                   "\nBooking sedang dalam proses";
            }
            else
            {
             return"\nCustomer ID        : "+getID()+
                    "\nNama              : "+getNama()+
                    "\nEmail             : "+getEmail()+
                    "\nPassword          : "+password+
                    "\nDate of Birth     : "+dobformat.format(getDOB())+
                    "\n";
            }
    }

    
}
