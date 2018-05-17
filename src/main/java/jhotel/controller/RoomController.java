package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
/**
 * Kelas ini mengatur dari sisi server dan sisi client saat pengambilan data kamar.
 *
 * @author Wisnu Wicaksono
 * @version 15/05/2018
 */
public class RoomController {
    /**
     * method ini mengatur sisi server untuk mengambil database room.
     */
    @RequestMapping(value="/vacantrooms")
    public ArrayList<Room> vacantRooms() {
        return DatabaseRoom.getVacantRooms();
    }

    /**
     * method ini mengatur sisi server untuk mengambil detail room berdasarkan id room.
     *
     * @param id_hotel
     * @param nomor_kamar
     */
    @RequestMapping("/room/{id_hotel}/{nomor_kamar}")
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String nomor_kamar){
        return DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
    }
}
