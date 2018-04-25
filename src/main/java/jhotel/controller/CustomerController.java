package jhotel;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.GregorianCalendar;
@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value ="/newcustomer",method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,@RequestParam(value="bulan") int bulan,@RequestParam(value="tanggal") int tanggal,@RequestParam(value="email") String email) {
        Customer customer = new Customer(name,2000,bulan,tanggal,email);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        };

        return customer;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

}