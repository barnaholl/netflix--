package com.codecool.videoproviderservice.service;

import com.codecool.videoproviderservice.model.Recommendation;
import com.codecool.videoproviderservice.model.RecommendationList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecommendationProvider {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${recommendation.url}")
    private String baseUrl;

    public Recommendation getRecommendationByVideoId(String id){
        return restTemplate.getForEntity(baseUrl+"/"+id,Recommendation.class).getBody();
    }

    public RecommendationList getAllRecommendationByVideoId(String id){
        RecommendationList recommendationList=restTemplate.getForEntity(baseUrl+"/all/"+id, RecommendationList.class).getBody();
        return recommendationList;
    }


}
