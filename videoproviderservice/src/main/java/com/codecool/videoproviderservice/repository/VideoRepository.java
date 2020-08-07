package com.codecool.videoproviderservice.repository;

import com.codecool.videoproviderservice.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
