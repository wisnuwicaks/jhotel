package jhotel.controller;

import jhotel.Hotel;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class HotelController {

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelList() {
        return DatabaseHotel.getHotelDatabase();
    }

    @RequestMapping(value = "/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel){
        return DatabaseHotel.getHotel(id_hotel);
    }


}
