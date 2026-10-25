package com.lcwd.Rating.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.annotation.Documented;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String remark;
    private String feedback;
}
