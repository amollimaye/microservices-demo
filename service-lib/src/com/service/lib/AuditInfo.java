package com.service.lib;


import java.io.Serializable;

/**
 * @author Amol Limaye
 **/
public class AuditInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String auditContent;

    public String getAuditContent() {
        return auditContent;
    }

    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent;
    }
}
