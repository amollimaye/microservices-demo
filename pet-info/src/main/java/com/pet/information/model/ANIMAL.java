package com.pet.information.model;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum ANIMAL {
    DOG("DOG"),
    CAT("CAT");

    ANIMAL(String animalType){
        this.animalType = animalType;
    }
    private String animalType;

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    private static final Map<String,ANIMAL> ENUM_MAP;
    static {
        Map<String,ANIMAL> map = new ConcurrentHashMap<String, ANIMAL>();
        for (ANIMAL instance : ANIMAL.values()) {
            map.put(instance.getAnimalType(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static ANIMAL getAnimal (String name) {
        return ENUM_MAP.get(name.toUpperCase());
    }
}
