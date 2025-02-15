package com.Traini8.TrainingCentersBackend.Repository;

import com.Traini8.TrainingCentersBackend.Entities.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter,String> {
}
