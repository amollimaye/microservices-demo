package com.amol.audit.model;

import javax.persistence.*;

/**
 * @author Amol Limaye
 **/
@Entity
@Table(name="audit_data",schema = "audit")
public class AuditData {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private String name;

    public AuditData(){
        
    }
    public AuditData(String name){
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
