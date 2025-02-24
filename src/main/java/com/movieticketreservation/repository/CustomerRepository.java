package com.movieticketreservation.repository;

import com.movieticketreservation.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
    Optional<CustomerEntity> findByEmail(String email);
}
