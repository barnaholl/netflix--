package com.codecool.videoproviderservice.service;

import com.codecool.videoproviderservice.model.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RecommendationProvider {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${recommendation.url}")
    private String baseUrl;

    public Recommendation getRecommendationByVideoId(String id){
        return restTemplate.getForEntity(baseUrl+"/"+id,Recommendation.class).getBody();
    }

}
