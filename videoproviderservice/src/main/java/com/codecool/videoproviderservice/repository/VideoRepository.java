package com.codecool.videoproviderservice.repository;

import com.codecool.videoproviderservice.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video,Long> {

    Video getById(Long id);

    List<Video> findAll();
}
