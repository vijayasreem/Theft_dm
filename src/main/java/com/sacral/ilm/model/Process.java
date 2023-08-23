package com.sacral.ilm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Process {
    @Id
    private Long id;
    private Long claimValue;
    private Integer tat;
    private Boolean virtualInvestigationProcess;
    private Boolean regularInvestigationProcess;
    private Boolean allocatedToInternal;
    private Boolean allocatedToExternal;
    private Boolean generateInvoice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClaimValue() {
        return claimValue;
    }

    public void setClaimValue(Long claimValue) {
        this.claimValue = claimValue;
    }

    public Integer getTat() {
        return tat;
    }

    public void setTat(Integer tat) {
        this.tat = tat;
    }

    public Boolean getVirtualInvestigationProcess() {
        return virtualInvestigationProcess;
    }

    public void setVirtualInvestigationProcess(Boolean virtualInvestigationProcess) {
        this.virtualInvestigationProcess = virtualInvestigationProcess;
    }

    public Boolean getRegularInvestigationProcess() {
        return regularInvestigationProcess;
    }

    public void setRegularInvestigationProcess(Boolean regularInvestigationProcess) {
        this.regularInvestigationProcess = regularInvestigationProcess;
    }

    public Boolean getAllocatedToInternal() {
        return allocatedToInternal;
    }

    public void setAllocatedToInternal(Boolean allocatedToInternal) {
        this.allocatedToInternal = allocatedToInternal;
    }

    public Boolean getAllocatedToExternal() {
        return allocatedToExternal;
    }

    public void setAllocatedToExternal(Boolean allocatedToExternal) {
        this.allocatedToExternal = allocatedToExternal;
    }

    public Boolean getGenerateInvoice() {
        return generateInvoice;
    }

    public void setGenerateInvoice(Boolean generateInvoice) {
        this.generateInvoice = generateInvoice;
    }

}