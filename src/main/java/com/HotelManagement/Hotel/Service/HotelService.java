package com.HotelManagement.Hotel.Service;

import com.HotelManagement.Hotel.Models.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotel();

    Hotel saveHotel(Hotel hotel);

    Hotel getHotelById(int id);

    Hotel updateHotel(Hotel hotel, int id);

    void deleteHotel(int id);
}
