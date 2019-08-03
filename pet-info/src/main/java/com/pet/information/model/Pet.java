package com.pet.information.model;

/**
 * @author Amol Limaye
 **/
public class Pet {
    public String petName;
    public ANIMAL animal;

    public Pet(String petName,ANIMAL animal){
        this.petName = petName;
        this.animal = animal;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public ANIMAL getAnimal() {
        return animal;
    }

    public void setAnimal(ANIMAL animal) {
        this.animal = animal;
    }
}
