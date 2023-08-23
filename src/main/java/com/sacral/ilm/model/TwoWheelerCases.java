// Spring Boot Entity/Model class package com.sacral.ilm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "two_wheeler_cases")
public class TwoWheelerCases {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "trigger_process")
    private String triggerProcess;
	
    @Column(name = "claim_value")
    private int claimValue;
	
    @Column(name = "allocate_process")
    private String allocateProcess;
	
    @Column(name = "generate_invoice")
    private boolean generateInvoice;
	
    @Column(name = "tat")
    private int tat;
	
    public TwoWheelerCases() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    public String getTriggerProcess() {
        return triggerProcess;
    }

    public void setTriggerProcess(String triggerProcess) {
        this.triggerProcess = triggerProcess;
    }
	
    public int getClaimValue() {
        return claimValue;
    }

    public void setClaimValue(int claimValue) {
        this.claimValue = claimValue;
    }
	
    public String getAllocateProcess() {
        return allocateProcess;
    }

    public void setAllocateProcess(String allocateProcess) {
        this.allocateProcess = allocateProcess;
    }
	
    public boolean getGenerateInvoice() {
        return generateInvoice;
    }

    public void setGenerateInvoice(boolean generateInvoice) {
        this.generateInvoice = generateInvoice;
    }
	
    public int getTAT() {
        return tat;
    }

    public void setTAT(int tat) {
        this.tat = tat;
    }
}