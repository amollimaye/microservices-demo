package com.pet.information.messaging;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author Amol Limaye
 **/
@Component
public class AuditInfo implements Serializable{

    private String auditContent;

    private static final long serialVersionUID = 1L;

    public String getAuditContent() {
        return auditContent;
    }

    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent;
    }
}
