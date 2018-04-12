import java.util.Date;
import java.util.regex.*;
import java.text.*;
/**
 * Write a description of class Customer here.
 *
 * @author Wisnu Wicaksono
 * @version 1 Maret 2018
 */
public class Customer
{
    
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;

    //Ini adalah constuctor class Customer
    public Customer(int id, String nama, int tahun, int bulan, int tanggal)
    {
        this.id=id;
        this.nama=nama;
        dob = new Date(tahun,bulan,tanggal);
    }
    
    public Customer(int id, String nama, Date dob){
        this.id=id;
        this.nama=nama;
        this.dob=dob;
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
        DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String output = formatter.format(dob);
        System.out.print(output);   
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
        
        if (m.matches()){
            this.email = email;
        }
       
    }
    public void setDOB(Date dob)
    {   
        this.dob=dob;
    }
    
        public String toString(){
            if (DatabasePesanan.getPesanan(this)!=null){
            return "\nCustomer ID       : "+id+
                   "\nNama              : "+nama+
                   "\nEmail             : "+email+
                   "\nDate of Birth     : "+dob+
                   "\nBooking order is in progress";
                }
                else{
            return "\nCustomer ID       : "+id+
                   "\nNama              : "+nama+
                   "\nEmail             : "+email+
                   "\nDate of Birth     : "+dob+
                   "\nBooking order is in progress";
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
