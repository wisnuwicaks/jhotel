
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
    
    private String tipe;
    
    TipeKamar(String tipe){
    this.tipe=tipe;
    }
    
    public String toString(){
        return tipe;
    
    }
    
}
