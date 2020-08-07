package com.codecool.videoproviderservice.model;

import lombok.*;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recommendation {

    private Long id;
    private int rating;
    private String comment;
    private Long videoId;
}
