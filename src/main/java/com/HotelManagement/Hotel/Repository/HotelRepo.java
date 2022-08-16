package com.HotelManagement.Hotel.Repository;

import com.HotelManagement.Hotel.Models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel ,Integer> {

}
