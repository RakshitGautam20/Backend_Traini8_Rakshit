package com.Traini8.TrainingCentersBackend.Services;


import com.Traini8.TrainingCentersBackend.Entities.TrainingCenter;
import com.Traini8.TrainingCentersBackend.Repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter saveEntry(TrainingCenter trainingCenter){
        trainingCenter.setCreatedOn(Instant.now().getEpochSecond());
        return trainingCenterRepository.save(trainingCenter);

    }
    public List<TrainingCenter> showAllEntries(){
        return trainingCenterRepository.findAll();
    }


}
