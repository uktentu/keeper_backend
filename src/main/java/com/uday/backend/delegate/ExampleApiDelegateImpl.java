package com.uday.backend.delegate;

import com.uday.backend.api.ExampleApiDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.uday.backend.model.ExampleResponse;

@Service
public class ExampleApiDelegateImpl implements ExampleApiDelegate {

    private static final Logger log = LoggerFactory.getLogger(ExampleApiDelegateImpl.class);

    @Override
    public ResponseEntity<ExampleResponse> getExample() {
        log.info("Received request for example data");

        // Create a sample response
        ExampleResponse response = new ExampleResponse();
        response.setId("1");
        response.setName("Example Name");
        response.setDescription("This is an example description.");

        log.debug("Response created: {}", response);
        // Return the response with HTTP 200 status
        return ResponseEntity.ok(response);
    }
}