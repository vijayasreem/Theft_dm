package com.sacral.ilm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sacral.ilm.model.RegularInvestigationProcess;

@Repository
public interface RegularInvestigationProcessRepository extends JpaRepository<RegularInvestigationProcess, Long> {
    
    // Query to trigger Regular Investigation Process from “Opus” to ILM system for investigation process
    @Query("SELECT r FROM RegularInvestigationProcess r WHERE r.trigger = 'auto' OR r.trigger = 'manual' OR r.trigger = 'self-analytics'")
    RegularInvestigationProcess triggerRegularInvestigationProcess();

    // Query to allocate Regular Investigation Process based upon “Location code, Product Code and Claim Amount”
    @Query("SELECT r FROM RegularInvestigationProcess r WHERE r.locationCode = ?1 AND r.productCode = ?2 AND r.claimAmount = ?3")
    RegularInvestigationProcess allocateRegularInvestigationProcess(String locationCode, String productCode, double claimAmount);

    // Query to get the TAT of Regular Investigation Process 
    @Query("SELECT r.tat FROM RegularInvestigationProcess r")
    int getRegularInvestigationProcessTAT();

    // Query to get the Investigation format of Regular Investigation Process
    @Query("SELECT r.investigationFormat FROM RegularInvestigationProcess r")
    String getRegularInvestigationProcessFormat();
}