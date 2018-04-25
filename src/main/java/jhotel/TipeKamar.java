package jhotel;
/**
 * Write a description of class TipeKamar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    private String deskripsi;

    TipeKamar(String tipe){
    this.deskripsi=tipe;
    }
    
    public String toString(){
        return deskripsi;
    
    }
    
}
