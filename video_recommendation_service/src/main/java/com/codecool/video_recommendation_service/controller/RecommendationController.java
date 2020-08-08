package com.codecool.video_recommendation_service.controller;

import com.codecool.video_recommendation_service.model.Recommendation;
import com.codecool.video_recommendation_service.repository.RecommendationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    private final RecommendationRepository recommendationRepository;

    public RecommendationController(RecommendationRepository recommendationRepository) {
        this.recommendationRepository = recommendationRepository;
    }

    @GetMapping("/{id}")
    public Recommendation getRecommendationById(@PathVariable("id") Long id){
        return recommendationRepository.getByVideoId(id);
    }

    @GetMapping("/all/{id}")
    public List<Recommendation> getAllRecommendationById(@PathVariable("id") Long id){
        return recommendationRepository.findAllByVideoId(id);
    }

    @PostMapping("/post")
    public boolean addRecommendation(){
        //TODO
        return false;
    }
}
