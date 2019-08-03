package com.okta.springbootwithauth.client;

import com.okta.springbootwithauth.model.pet.Pet;
import com.okta.springbootwithauth.model.pet.PetsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Amol Limaye
 **/
@Component
public class AnimalServiceClient {

    RestTemplate restTemplate;

    public AnimalServiceClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<Pet> getPets(){
        ResponseEntity<PetsResponse> response = restTemplate.getForEntity("http://localhost:8090/pets", PetsResponse.class);

        return response.getBody().getPetList();
    }
}
