package com.codecool.video_recommendation_service.model;

import lombok.Builder;
import lombok.Data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Recommendation {

    @Id
    @GeneratedValue
    private Long id;
    private int rating;
    private String comment;
    private Long videoId;
}
