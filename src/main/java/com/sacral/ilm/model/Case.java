package com.sacral.ilm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String investigatorType;
    private String caseDetails;
    private String remarks;

    public Case() {

    }

    public Case(String investigatorType, String caseDetails, String remarks) {
        this.investigatorType = investigatorType;
        this.caseDetails = caseDetails;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestigatorType() {
        return investigatorType;
    }

    public void setInvestigatorType(String investigatorType) {
        this.investigatorType = investigatorType;
    }

    public String getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
}