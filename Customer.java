
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    protected int id;
    protected String nama;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int i, String n)
    {
        i=id;
        n=nama;
    }

    public int getID()
    {
        return id;
    }
    public String getNama()
    {
        return nama;
    }
    public void setID(int id1)
    {
       id=id1;
    }
    
    public void setNama(String nama1)
    {
        nama=nama1;
    }
    
}
