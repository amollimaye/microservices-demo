package com.amol.audit.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amol Limaye
 **/
public class ResponseData {

    public List<AuditData> auditDataList = new ArrayList<>();

    public ResponseData(){

    }

    public ResponseData(Iterable<AuditData> auditDataIterable){
        auditDataIterable.forEach(
                auditData -> {
                    auditDataList.add(auditData);
                }

        );
    }

    public List<AuditData> getAuditDataList() {
        return auditDataList;
    }

    public void setAuditDataList(List<AuditData> auditDataList) {
        this.auditDataList = auditDataList;
    }
}
