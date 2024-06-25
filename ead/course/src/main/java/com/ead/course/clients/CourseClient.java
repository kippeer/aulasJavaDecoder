package com.ead.course.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Component
public class CourseClient {
    @Autowired
    RestTemplate restTemplate;

    String REQUEST_URI = "http://localhost:8082";


    public Page<CourseDto> getAllCourseByUser(UUID userId, Pageable pageable) {
        List<CourseDto> searchResult = null;
        String url = utilsService.createUrl(userId,pageable);

        log.debug("Request URL:{}", url);
        log.info("Request URL:{}", url);
        try{
            log.debug("Response Number of Elements:{}", searchResult.size());
        } catch(HttpStatusCodeException e){
            log.error("Error request /courses{}", e);

        }
        log.info("Ending request / courses userId{}", userId);
        return new PageImpl<>(searchResult);
    }

}
