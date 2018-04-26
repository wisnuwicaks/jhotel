package jhotel.controller;
import jhotel.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class PesananController {
    @RequestMapping("pesanancustomer/id")
    public Pesanan pesananCust(@PathVariable int id_customer){
        Pesanan pesan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesan;
    }

    @RequestMapping("")
    public Pesanan buatPesanan(@RequestParam(value="jumlah_hari") int jumlah_hari,
                               @RequestParam(value="id_customer") int id_customer,
                               @RequestParam(value="id_hotel") int id_hotel,
                               @RequestParam(value="nomor_kamar") String nomor_kamar)
    {
        try{
            DatabasePesanan.addPesanan(new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer)));
        }
        catch(PesananSudahAdaException a){
            a.getPesan();
        }

        Pesanan pesanan = DatabasePesanan.getPesananAktif(
                DatabaseCustomer.getCustomer(id_customer));

        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);

        Administrasi.pesananDitugaskan(pesanan,kamar);
        if(kamar != null)
        {
            pesanan.setBiaya();
        }

        return pesanan;

    }

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@PathVariable int id_pesanan){
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        if(pesanan!= null)
        {
            Administrasi.pesananDibatalkan(pesanan);
        }
        return pesanan;
    }
    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan selesaiPesanan(@PathVariable int id_pesanan){
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        if(pesanan!= null)
        {
            Administrasi.pesananSelesai(pesanan);
        }
        return pesanan;
    }




}
