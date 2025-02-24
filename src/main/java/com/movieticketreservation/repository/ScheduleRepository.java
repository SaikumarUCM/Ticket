package com.movieticketreservation.repository;

import com.movieticketreservation.entity.ScheduleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends MongoRepository<ScheduleEntity, String> {
    List<ScheduleEntity> findByMovieId(String movieId);
    // Add custom queries if needed
}
