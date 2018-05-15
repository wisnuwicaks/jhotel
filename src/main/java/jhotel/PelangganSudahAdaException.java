package jhotel;
/**
 * @author Wisnu Wicaksono
 * @version 9.0
 * @exception PelangganSudahAdaException kelas menangani exception bila object Customer yang dibuat sudah ada sebelumnya.
 * @since 14 April 2018
 */
public class PelangganSudahAdaException extends Exception
{
    private Customer pelanggan_error;

    public PelangganSudahAdaException(Customer pelanggan_input)
    {
        super("Pelanggan dengan data : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + " sudah terdaftar.";
    }
}