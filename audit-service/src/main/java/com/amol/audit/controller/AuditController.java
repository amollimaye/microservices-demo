package com.amol.audit.controller;

import com.amol.audit.model.AuditData;
import com.amol.audit.model.ResponseData;
import com.amol.audit.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amol Limaye
 **/
@RestController
public class AuditController {

    @Autowired
    AuditRepository auditRepository;

    @GetMapping("/get")
    public ResponseData getAuditData(){
        return new ResponseData(auditRepository.findAll());
    }

    @PostMapping("/add")
    public void addAuditData(@RequestParam String auditDataRecord){
        auditRepository.save(new AuditData(auditDataRecord));
    }
}
