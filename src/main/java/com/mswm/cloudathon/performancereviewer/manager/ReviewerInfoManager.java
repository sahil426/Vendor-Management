package com.mswm.cloudathon.performancereviewer.manager;

import com.mswm.cloudathon.performancereviewer.model.ProcessContingentResponse;
import com.mswm.cloudathon.performancereviewer.model.ReviewerRequest;
import com.mswm.cloudathon.performancereviewer.services.ReviewerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReviewerInfoManager {

    @Autowired
    private final ReviewerInfoService reviewerInfoService;

    @Autowired
    public ReviewerInfoManager(ReviewerInfoService reviewerInfoService){
        this.reviewerInfoService = reviewerInfoService;
    }

    public ResponseEntity<Object> getContingents(ReviewerRequest reviewerRequest){
        ProcessContingentResponse processContingentResponse = reviewerInfoService.getContingents(reviewerRequest);
        return new ResponseEntity<>(processContingentResponse, HttpStatus.OK);
    }
}
