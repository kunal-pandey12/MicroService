package com.lcwd.Rating.controller;

import com.lcwd.Rating.entites.Rating;
import com.lcwd.Rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class HotelController {

    @Autowired
    private RatingService ratingservice;


    @PostMapping
    public ResponseEntity<Rating>create(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingservice.create(rating));
    }


    @GetMapping
    public ResponseEntity<List<Rating>> getRatings() {
        return ResponseEntity.ok(ratingservice.getRatings());
    }


    @GetMapping("/userId/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(
            @PathVariable("userId") String userId) {
        return ResponseEntity.ok(
                ratingservice.getRatingByUserId(userId));
    }


    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(
            @PathVariable("hotelId") String hotelId) {

        return ResponseEntity.ok(
                ratingservice.getRatingByHotelId(hotelId));
    }

}
