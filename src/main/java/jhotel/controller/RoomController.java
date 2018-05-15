package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
public class RoomController {
    @RequestMapping(value="/vacantrooms")
    public ArrayList<Room> vacantRooms() {
        return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping("/room/{id_hotel}/{nomor_kamar}")
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String nomor_kamar){
        return DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
    }
}
