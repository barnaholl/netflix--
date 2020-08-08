package com.codecool.videoproviderservice.model;

import lombok.Data;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendationList {
    private List<Recommendation> recommendationList;
}
