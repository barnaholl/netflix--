package com.codecool.videoproviderservice.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideoWithRecommendations {
    private Long id;
    private String name;
    private String url;
    private List<Recommendation> recommendations;
}

