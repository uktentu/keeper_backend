package com.uday.backend.delegate;

import com.uday.backend.api.HealthCheckApiDelegate;
import com.uday.backend.model.HealthCheckResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckApiDeligateImpl implements HealthCheckApiDelegate {

    private static final Logger log = LoggerFactory.getLogger(HealthCheckApiDeligateImpl.class);

    @Override
    public ResponseEntity<HealthCheckResponse> healthCheck(){
        log.info("Received health check request");

        // Create a sample health check response
        HealthCheckResponse response = new HealthCheckResponse();
        response.setStatus("UP");
        response.setMessage("Service is running");
        return ResponseEntity.ok(response);
    }
}
