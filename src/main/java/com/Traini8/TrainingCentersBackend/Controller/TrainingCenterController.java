package com.Traini8.TrainingCentersBackend.Controller;
import com.Traini8.TrainingCentersBackend.Entities.TrainingCenter;
import com.Traini8.TrainingCentersBackend.Services.TrainingCenterService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping("/add")  // API to add a new entry
    public ResponseEntity<TrainingCenter> createEntry(@RequestBody @Valid TrainingCenter trainingCenter){
        //System.out.println("Received: " + trainingCenter);
        TrainingCenter savedCenter = trainingCenterService.saveEntry(trainingCenter);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCenter);

    }
    @GetMapping("findAll")   // API to retrieve all the saved entries
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainingCenterService.showAllEntries();
        return ResponseEntity.ok(centers);
    }



}
