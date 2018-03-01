
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

    //Ini adalah constuctor class Customer
    public Customer(int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }

    public int getID()
    {
        return id;
    }
    public String getNama()
    {
        return nama;
    }
    public void setID(int id)
    {
    this.id=id;  
    }
    
    public void setNama(String nama)
    {
    this.nama=nama;  
    }
    
    public void printData()
    {
        System.out.print("Nama :" + nama);
    }
    
}
