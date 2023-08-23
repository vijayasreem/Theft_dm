package com.sacral.ilm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "send_auto_email_to_lso")
public class SendAutoEmailToLSO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caseDetails;
    private String remarks;
    private String caseRecords;
    private String timeFrame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCaseRecords() {
        return caseRecords;
    }

    public void setCaseRecords(String caseRecords) {
        this.caseRecords = caseRecords;
    }

    public String getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame;
    }

}