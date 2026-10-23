package com.lcwd.hotel.service;

import com.lcwd.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {

    // create
    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    // get single
    Hotel get(String id);
}
