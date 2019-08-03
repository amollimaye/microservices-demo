package com.okta.springbootwithauth;

import com.okta.springbootwithauth.client.AnimalServiceClient;
import com.okta.springbootwithauth.model.pet.Pet;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
class SimpleAppController {

    final AdminService adminService;

    @Autowired
    AnimalServiceClient animalServiceClient;

    public static org.slf4j.Logger Logger = LoggerFactory.getLogger(SimpleAppController.class);
    @Autowired
    public SimpleAppController(AdminService adminService){
        this.adminService = adminService;
    }
    @RequestMapping("/")
    public String home(Model model) {
        Logger.info("In controller--");
        return "home";
    }


    @RequestMapping("/admin")
    public String admin(Model model){
        adminService.ensureAdmin();
        Logger.info("In admin page--");
        List<Pet> pets =animalServiceClient.getPets();
        model.addAttribute("pets",pets);
        return "admin";
    }

    @RequestMapping("/restricted")
    String restricted() {
        return "restricted";
    }


}