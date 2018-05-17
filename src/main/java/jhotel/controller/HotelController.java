package jhotel.controller;

import jhotel.Hotel;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
/**
 * Kelas ini mengatur dari sisi server dan sisi client saat pengambilan data hotel.
 *
 * @author Wisnu Wicaksono
 * @version 15/05/2018
 */
public class HotelController {

    /**
     * method hini mengatur sisi server untuk Database Hotel.
     */
    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelList() {
        return DatabaseHotel.getHotelDatabase();
    }

    /**
     * method ini mengatur sisi server untuk pengambilan data hotel berdasarkan id dari hotel..
     *
     * @param id_hotel
     */
    @RequestMapping(value = "/hotel/{id_hotel}")
    public Hotel getHotel(@PathVariable int id_hotel){
        return DatabaseHotel.getHotel(id_hotel);
    }


}
