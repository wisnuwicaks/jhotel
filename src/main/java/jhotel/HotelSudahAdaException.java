package jhotel;
/**
 * @author Wisnu Wicaksono
 * @version 9.0
 * @exception HotelSudahAdaException kelas turunan Exception yang akan menangani bila hotel yang diinputkan sudah ada
 * @since 14 April 2018
 */
public class HotelSudahAdaException extends Exception{
    private Hotel hotel_error;
    public HotelSudahAdaException(Hotel hotel_input){
        super("Hotel dengan nama : ");
        hotel_error=hotel_input;
    }
    public String getPesan(){
        return super.getMessage() + hotel_error.getNama() +"sudah terdaftar.";
    }
}
