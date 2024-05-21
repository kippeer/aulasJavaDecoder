package com.ead.authuser.clients;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import com.ead.authuser.dtos.CourseDto

import java.util.UUID;
import java.util.List;

@Log4j2
@Component
public class UserClient {
    @Autowired
    RestTemplate restTemplate;

    String REQUEST_URI = "http://localhost:8082";


    public Page<CourseDto> getAllCourseByUser(UUID userId, Pageable pageable) {
        List<CourseDto> searchResult = null;
        String url = REQUEST_URI + "/courses?userId=" + userId + "&page=" + pageable.getPageNumber()
                + "&size=" + pageable.getPageSize() + "&sort="
                + pageable.getSort().toString().replaceAll(": ", ",");

        log.debug("Request URL:{}", url);
        log.info("Request URL:{}", url);
        try{
            log.debug("Response Number of Elements:{}", searchResult.size());
        } catch(HttpStatusCodeException e){
            log.error("Error request /courses{}", e);

        }
        log.info("Ending request / courses userId{}", userId);
        return null;
    }
}
