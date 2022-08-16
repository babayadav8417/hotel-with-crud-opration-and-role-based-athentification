package com.HotelManagement.Hotel.Controllers;

import com.HotelManagement.Hotel.Models.Hotel;
import com.HotelManagement.Hotel.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class hotelController {
    @Autowired
    private HotelService hotelService;

    public hotelController(HotelService hotelService){
        this.hotelService=hotelService;
    }
    @GetMapping
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotel();
    }
    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel)
    {
        return new ResponseEntity<Hotel>(hotelService.saveHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public  ResponseEntity<Hotel> getHoteltById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Hotel>((Hotel) hotelService.getHotelById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public  ResponseEntity<Hotel> updateHotel(@PathVariable("id")int id, @RequestBody Hotel hotel)
    {
        return new ResponseEntity<Hotel>(hotelService.updateHotel(hotel,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteHotel(@PathVariable("id")int id)
    {
        hotelService.deleteHotel(id);
        return new ResponseEntity<String>("Hotel deleted successfully",HttpStatus.OK);
    }
}
//<Hotel>
//<hotelName>siddhivinayak</hotelName>
//<costmerFName>Gopi</costmerFName>
//<costmerLName>yadav</costmerLName>
//<mobNo>6386371975</mobNo>
//<hotelManagerFName>BABA</hotelManagerFName>
//<hotelManagerLName>YADAV</hotelManagerLName>
//<orderNo>12</orderNo>
//</Hotel>