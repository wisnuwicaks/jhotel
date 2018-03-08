
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
   
   public static void pesananDitugaskan(Pesanan pesan,Room kamar){
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setRoom(kamar);
       roomLepasPesanan(pesan.getRoom());
    }
   public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
       kamar.setStatusKamar(StatusKamar.BOOKED);
       kamar.setPesanan(pesan);
    }
   public static void roomLepasPesanan(Room kamar){
       kamar.setStatusKamar(StatusKamar.VACANT);
       kamar.setPesanan(null);
    }
   public static void pesananDibatalkan(Room kamar){
       Pesanan pesan = kamar.getPesanan();
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       kamar.setPesanan(null);
       roomLepasPesanan(pesan.getRoom());
    }
   public static void pesananSelesai(Room kamar){
       Pesanan pesan = kamar.getPesanan();
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       kamar.setPesanan(null);
       roomAmbilPesanan(pesan,kamar);
    }
   public static void pesananDibatalkan(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
     
    }
   public static void pesananSelesai(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    } 
}
