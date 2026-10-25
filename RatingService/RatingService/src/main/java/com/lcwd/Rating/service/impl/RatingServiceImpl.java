package com.lcwd.Rating.service.impl;

import com.lcwd.Rating.entites.Rating;
import com.lcwd.Rating.repo.RatingRepo;
import com.lcwd.Rating.service.RatingService;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo RatingRepo;

    @Override
    public Rating create(Rating rating) {
        return RatingRepo.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return RatingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String UserId) {
        return RatingRepo.findByUserId(UserId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String HotelId) {
        return RatingRepo.findByHotelId(HotelId);
    }
}
