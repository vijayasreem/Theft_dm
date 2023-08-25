package com.sacral.ilm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "investigation_management_system")
public class InvestigationManagementSystem {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String caseNumber;
    private String caseDescription;
    private String caseStatus;
    private String assignedTo;
    private String invoiceNumber;
    private String reportStatus;
    private String emailNotification;
    private String waiveOff;
    private String history;
 
    public InvestigationManagementSystem() {
    }
 
    public InvestigationManagementSystem(String caseNumber, String caseDescription, String caseStatus, String assignedTo, String invoiceNumber, String reportStatus, String emailNotification, String waiveOff, String history) {
        this.caseNumber = caseNumber;
        this.caseDescription = caseDescription;
        this.caseStatus = caseStatus;
        this.assignedTo = assignedTo;
        this.invoiceNumber = invoiceNumber;
        this.reportStatus = reportStatus;
        this.emailNotification = emailNotification;
        this.waiveOff = waiveOff;
        this.history = history;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getCaseNumber() {
        return caseNumber;
    }
 
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
 
    public String getCaseDescription() {
        return caseDescription;
    }
 
    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }
 
    public String getCaseStatus() {
        return caseStatus;
    }
 
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }
 
    public String getAssignedTo() {
        return assignedTo;
    }
 
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
 
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
 
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
 
    public String getReportStatus() {
        return reportStatus;
    }
 
    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }
 
    public String getEmailNotification() {
        return emailNotification;
    }
 
    public void setEmailNotification(String emailNotification) {
        this.emailNotification = emailNotification;
    }
 
    public String getWaiveOff() {
        return waiveOff;
    }
 
    public void setWaiveOff(String waiveOff) {
        this.waiveOff = waiveOff;
    }
 
    public String getHistory() {
        return history;
    }
 
    public void setHistory(String history) {
        this.history = history;
    }
 
    @Override
    public String toString() {
        return "InvestigationManagementSystem{" +
                "id=" + id +
                ", caseNumber='" + caseNumber + '\'' +
                ", caseDescription='" + caseDescription + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", reportStatus='" + reportStatus + '\'' +
                ", emailNotification='" + emailNotification + '\'' +
                ", waiveOff='" + waiveOff + '\'' +
                ", history='" + history + '\'' +
                '}';
    }
}