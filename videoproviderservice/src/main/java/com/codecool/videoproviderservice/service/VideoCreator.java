package com.codecool.videoproviderservice.service;

import com.codecool.videoproviderservice.model.Video;
import com.codecool.videoproviderservice.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class VideoCreator implements CommandLineRunner {

    private final VideoRepository videoRepository;

    public VideoCreator(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public void createVideos(){
        Video deathPit = Video.builder().name("Death Pit").url("https://www.youtube.com/watch?v=YTcabt40hOI").build();
        Video casket = Video.builder().name("Casket").url("https://www.youtube.com/watch?v=ZaPbfO5YwGA").build();
        Video casketVip = Video.builder().name("CasketVip").url("https://www.youtube.com/watch?v=BP82Lm0X5iE").build();
        Video blunder = Video.builder().name("Blunder").url("https://www.youtube.com/watch?v=blygbyrP5zM").build();

        videoRepository.save(deathPit);
        videoRepository.save(casket);
        videoRepository.save(casketVip);
        videoRepository.save(blunder);
    }


    @Override
    public void run(String... args) throws Exception {
        createVideos();

    }
}
