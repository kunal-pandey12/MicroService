package com.lcwd.hotel.service.Impl;

import com.lcwd.hotel.entites.Hotel;
import com.lcwd.hotel.excepations.ResourceNotfoundException;
import com.lcwd.hotel.repo.HotelRepo;
import com.lcwd.hotel.service.HotelService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo HotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
            hotel.setId(hotelId);
        return HotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return HotelRepo.findAll();
    }

    @Override
    public Hotel get(String id) {
        return HotelRepo.findById(id).orElseThrow(()->new ResourceNotfoundException("hotel with give id not found !!"));
    }
}
