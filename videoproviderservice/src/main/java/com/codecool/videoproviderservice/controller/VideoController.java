package com.codecool.videoproviderservice.controller;


import com.codecool.videoproviderservice.model.Video;
import com.codecool.videoproviderservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {

    private final VideoRepository videoRepository;

    @Autowired
    private Environment environment;

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

}
