package jhotel;
import java.util.Date;
import java.util.regex.*;
import java.util.*;
import java.text.*;
/**
 * Write a description of class Customer here.
 *
 * @author Wisnu Wicaksono
 * @version 1.0
 */
public class Customer
{
    
    // instance variables class Customer
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;

    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    /**
     * Constructor dari class Customer.
     *
     * @param nama  nama pelanggan
     * @param tanggal  tanggal lahir pelanggan
     * @param bulan  bulan lahir pelanggan
     * @param tahun  tahun lahir pelanggan
     */
    public Customer(String nama, int tahun, int bulan, int tanggal, String email)
    {
        this.id=DatabaseCustomer.getLastCustomerID() + 1;
        this.nama=nama;
        this.dob = new GregorianCalendar(tahun, bulan - 1, tanggal).getTime();
        this.email=email;
    }
    
    public Customer(String nama, Date dob, String email){
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = dob;
        this.email=email;
    }

    public int getID()
    {
        return id;
    }
    public String getNama()
    {
        return nama;
    }
    public String getEmail()
    {
        return email;
    }
    
    public Date getDOB()
    {
        //DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        //String output = formatter.format(dob);
        //System.out.print(output);
        return dob;
    }
    public void setID(int id)
    {
        this.id=id;  
    }
    
    public void setNama(String nama)
    {
        this.nama=nama;  
    }
    
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
    public void setDOB(Date dob)
    {   
        this.dob=dob;
    }
    
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
             return"\nCustomer ID       : "+getID()+
                    "\nNama              : "+getNama()+
                    "\nEmail             : "+getEmail()+
                    "\nDate of Birth     : "+dobformat.format(getDOB())+
                    "\nBooking sedang dalam proses";
            }
    }
    /*
    public void printData()
    {
        System.out.println("Customer");
        System.out.println("ID :" + id);
        System.out.println("Nama :" + nama);
    }
    */
    
}
