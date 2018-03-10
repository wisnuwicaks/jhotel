
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
   /**
     * Method ini untuk memproses ruangan yang akan di-assign. 
     */
   public static void pesananDitugaskan(Pesanan pesan,Room kamar){
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setRoom(kamar);
       roomAmbilPesanan(pesan, kamar);
    }
    
    /**
     * Method ini untuk menyatakan bahwa status ruangan 
     * sudah berubah menjadi “booked” dan “ter-link” 
     * dengan objek Pesanan yang diberikan.
     */
   public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
       kamar.setStatusKamar(StatusKamar.BOOKED);
       kamar.setPesanan(pesan);
    }
    
    /**
     * Method ini untuk menyatakan bahwa status ruangan 
     * sudah berubah menjadi “vacant” dan “ter-link” 
     * dengan objek Pesanan yang diberikan.
     */
   public static void roomLepasPesanan(Room kamar){
       kamar.setStatusKamar(StatusKamar.VACANT);
       kamar.setPesanan(null);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room 
     * yang telah membatalkan pesanan serta me-unlink masing-masing objek. 
     */
   public static void pesananDibatalkan(Room kamar){
       kamar.getPesanan().setStatusSelesai(false);
       kamar.getPesanan().setStatusDiproses(false);
       kamar.setPesanan(null);
       roomLepasPesanan(kamar);
    }
    
   /**
    *  Method ini untuk mengubah status pesanan dan status room 
    *  yang telah menyelesaikan pesanan serta me-unlink masing-masing objek. 
    */ 
   public static void pesananSelesai(Room kamar){
       kamar.getPesanan().setStatusSelesai(true);
       kamar.getPesanan().setStatusDiproses(false);
       kamar.setPesanan(null);
       roomLepasPesanan(kamar);    
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room 
     * yang telah membatalkan pesanan serta me-unlink masing-masing objek. 
     */
   public static void pesananDibatalkan(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
     
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room 
     * yang telah menyelesaikan pesanan serta me-unlink masing-masing objek. 
     */
   public static void pesananSelesai(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    } 
}
