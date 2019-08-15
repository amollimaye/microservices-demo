package com.pet.information.controller;

import com.pet.information.messaging.MessageSender;
import com.pet.information.model.PetsResponse;
import com.pet.information.processor.PetFetcher;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amol Limaye
 **/
@RestController
public class PetInfoController {

    public static org.slf4j.Logger Logger = LoggerFactory.getLogger(PetInfoController.class);
    @Autowired
    PetFetcher petFetcher;

    @Autowired
    MessageSender messageSender;

    @GetMapping("/pets")
    public PetsResponse getPets(){
        messageSender.sendAuditInfoMessage("Message is /pets");
        return new PetsResponse(petFetcher.getPetList());
    }
}
