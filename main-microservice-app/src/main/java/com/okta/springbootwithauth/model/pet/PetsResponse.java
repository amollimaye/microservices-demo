package com.okta.springbootwithauth.model.pet;

import java.util.List;

/**
 * @author Amol Limaye
 **/
public class PetsResponse {

    private List<Pet> petList;

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }
}
