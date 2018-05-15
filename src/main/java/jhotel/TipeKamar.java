package jhotel;
/**
 * Ini adalah kelas tipe enum yang menyediakan tipe kamar.
 * @author Wisnu Wicaksono
 * @version 9.0
 * @since 14 April 2018
 */
public enum TipeKamar
{
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");
    
    private String deskripsi;
    /**
     *@param tipe adalah parameter yang menyimpan tipe kamar
     */
    TipeKamar(String tipe){
    this.deskripsi=tipe;
    }
    
    public String toString(){
        return deskripsi;
    
    }
    
}
