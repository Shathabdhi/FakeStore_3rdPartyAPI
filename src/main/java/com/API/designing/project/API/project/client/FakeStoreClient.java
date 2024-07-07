package com.API.designing.project.API.project.client;

import com.API.designing.project.API.project.DTO.FakestoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")//takes the value from application properties file and injects the value into this variable
    private String fakeStoreAPIBaseURL;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;
    public List<FakestoreProductResponseDTO> getAllProducts(){
        String fakeStoreGetAllProductsURL = fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakestoreProductResponseDTO[]> productResponseList =
        restTemplate.getForEntity(fakeStoreGetAllProductsURL, FakestoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());
    }
}
