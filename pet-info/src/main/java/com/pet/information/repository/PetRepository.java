package com.pet.information.repository;

import com.pet.information.model.ANIMAL;
import com.pet.information.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Amol Limaye
 **/
@Repository
public class PetRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final Logger log = LoggerFactory.getLogger(PetRepository.class);

    public List<Pet> getAll(){
        return jdbcTemplate.query("select pet_name,animal from pet;",
                (rs, rowNum) -> new Pet(rs.getString("pet_name"), ANIMAL.getAnimal(rs.getString("animal")))
        );
    }
}
