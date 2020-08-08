package com.codecool.videoproviderservice.controller;


import com.codecool.videoproviderservice.model.Recommendation;
import com.codecool.videoproviderservice.model.RecommendationList;
import com.codecool.videoproviderservice.model.Video;
import com.codecool.videoproviderservice.model.VideoWithRecommendations;
import com.codecool.videoproviderservice.repository.VideoRepository;
import com.codecool.videoproviderservice.service.RecommendationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {

    private final VideoRepository videoRepository;

    @Autowired
    private Environment environment;

    @Autowired
    private RecommendationProvider recommendationProvider;


    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping("/all")
    public List<Video> getAll(){
        return videoRepository.findAll();
    }

    @GetMapping("/port")
    public String port(){
        return environment.getProperty("server.port");
    }

    @GetMapping("/{id}")
    public VideoWithRecommendations test(@PathVariable("id") String id){
       Video videoData=videoRepository.getById(Long.valueOf(id));
       VideoWithRecommendations videoWithRecommendations=new VideoWithRecommendations();
       videoWithRecommendations.setId(videoData.getId());
       videoWithRecommendations.setName(videoData.getName());
       videoWithRecommendations.setUrl(videoData.getUrl());
       Recommendation recommendation=recommendationProvider.getRecommendationByVideoId(id);
       //TODO ask why
       //RecommendationList recommendationList=recommendationProvider.getAllRecommendationByVideoId(id);
       //videoWithRecommendations.setRecommendations(recommendationProvider.getAllRecommendationByVideoId(id));

        return  videoWithRecommendations;
    }



}
