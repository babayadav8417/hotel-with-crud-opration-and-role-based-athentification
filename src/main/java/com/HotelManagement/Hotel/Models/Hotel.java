package com.HotelManagement.Hotel.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "HotelDetails")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String hotelName;
    @Column(nullable = false)
    private String HotelManagerFName;
    @Column(nullable = false)
    private String HotelManagerLName;
    @Column(nullable = false)
    private String costmerFName;
    @Column(nullable = false)
    private String costmerLName;
    @Column(nullable = false)
    private int OrderNo;
    @Column(nullable = false)
    private long mobNo;
}
