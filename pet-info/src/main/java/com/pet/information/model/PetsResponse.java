package com.pet.information.model;

import java.util.List;

/**
 * @author Amol Limaye
 **/
public class PetsResponse {

    public PetsResponse(List<Pet> petList){
        this.petList = petList;
    }

    private List<Pet> petList;

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }
}
