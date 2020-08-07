package com.codecool.video_recommendation_service.repository;

import com.codecool.video_recommendation_service.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation,Long> {
    Recommendation getByVideoId(Long id);
}
