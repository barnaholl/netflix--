package com.codecool.video_recommendation_service.service;

import com.codecool.video_recommendation_service.model.Recommendation;
import com.codecool.video_recommendation_service.repository.RecommendationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecommendationCreator implements CommandLineRunner{

    private final RecommendationRepository recommendationRepository;

    public RecommendationCreator(RecommendationRepository recommendationRepository) {
        this.recommendationRepository = recommendationRepository;
    }

    public void createRecommendations() {

        Recommendation recommendation = Recommendation.builder().comment("fire").rating(5).videoId((long) 1).build();
        Recommendation recommendation2 = Recommendation.builder().comment("lit AF").rating(4).videoId((long) 2).build();

        recommendationRepository.save(recommendation);
        recommendationRepository.save(recommendation2);
    }

        @Override
        public void run(String... args) throws Exception {
            createRecommendations();
        }
    }

