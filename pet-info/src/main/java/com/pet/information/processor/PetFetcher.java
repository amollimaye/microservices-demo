package com.pet.information.processor;

import com.pet.information.model.Pet;
import com.pet.information.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Amol Limaye
 **/
@Component
public class PetFetcher {
    @Autowired
    private PetRepository petRepository;

    public List<Pet> getPetList(){
        return petRepository.getAll();
    }
}
