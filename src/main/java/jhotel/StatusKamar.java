package jhotel;
/**
 * Write a description of class StatusKamar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum StatusKamar
{
    BOOKED("Booked"),
    PROCESSED("Processed"),
    VACANT("Vacant");
    
    private String status;
    
    StatusKamar(String status){
    this.status=status;
    }
    
    public String toString(){
        return status;
    
    }
}
