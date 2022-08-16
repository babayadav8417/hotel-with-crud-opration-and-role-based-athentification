package com.HotelManagement.Hotel.Service;

import com.HotelManagement.Hotel.Models.Hotel;
import com.HotelManagement.Hotel.Repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceIMPL implements HotelService{
    @Autowired
    private HotelRepo hotelRepo;

    public HotelServiceIMPL(HotelRepo hotelRepo) {
        this.hotelRepo=hotelRepo ;
    }

    @Override
    public List getAllHotel()
    {
        return hotelRepo.findAll();
    }
    @Override
    public Hotel getHotelById(int id)
    {
        return hotelRepo.findById(id).orElseThrow();
    }

    @Override
    public Hotel saveHotel(Hotel hotel)
    {
        return (Hotel) hotelRepo.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel,int id)
    {
        Hotel existingHotel=hotelRepo.findById(id).orElseThrow();
        existingHotel.setHotelName(hotel.getHotelName());
        existingHotel.setHotelManagerFName(hotel.getHotelManagerFName());
        existingHotel.setHotelManagerLName(hotel.getHotelManagerLName());
        existingHotel.setCostmerFName(hotel.getCostmerFName());
        existingHotel.setCostmerLName(hotel.getCostmerLName());
        existingHotel.setOrderNo(hotel.getOrderNo());
        existingHotel.setMobNo(hotel.getMobNo());
        hotelRepo.save(existingHotel);
        return existingHotel;
    }
    @Override
    public void deleteHotel(int id)
    {
        hotelRepo.findById(id).orElseThrow();
        hotelRepo.deleteById(id);
    }
}

