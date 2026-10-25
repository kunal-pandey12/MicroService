package com.lcwd.Rating.service;

import com.lcwd.Rating.entites.Rating;

import java.util.List;

public interface RatingService {

    // create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all ratingBy UserId
    List<Rating>getRatingByUserId(String UserId);

    // get all by hotel
    List<Rating>getRatingByHotelId(String HotelId);
}
