package com.sacral.ilm.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ilm.model.RegularInvestigationProcess;
import com.sacral.ilm.repository.RegularInvestigationProcessRepository;

@Service
public class RegularInvestigationProcessService {
    
    @Autowired
    private RegularInvestigationProcessRepository regularInvestigationProcessRepository;
    
    // Method to trigger Regular Investigation Process from “Opus” to ILM system for investigation process
    public RegularInvestigationProcess triggerRegularInvestigationProcess(String trigger) {
        return regularInvestigationProcessRepository.triggerRegularInvestigationProcess(trigger);
    }
    
    // Method to allocate Regular Investigation Process based upon “Location code, Product Code and Claim Amount”
    public RegularInvestigationProcess allocateRegularInvestigationProcess(String locationCode, String productCode, double claimAmount) {
        return regularInvestigationProcessRepository.allocateRegularInvestigationProcess(locationCode, productCode, claimAmount);
    }
    
    // Method to get the TAT of Regular Investigation Process
    public int getRegularInvestigationProcessTAT() {
        return regularInvestigationProcessRepository.getRegularInvestigationProcessTAT();
    }
    
    // Method to get the Investigation format of Regular Investigation Process
    public String getRegularInvestigationProcessFormat() {
        return regularInvestigationProcessRepository.getRegularInvestigationProcessFormat();
    }
    
    // Method to generate Investigation format of “INV-MTR-THEFT-FY-XXXXXX” for the Regular Investigation Process
    public String generateRegularInvestigationProcessFormat() {
        LocalDateTime now = LocalDateTime.now();
        String year = String.valueOf(now.getYear());
        String month = String.valueOf(now.getMonthValue());
        String day = String.valueOf(now.getDayOfMonth());
        return "INV-MTR-THEFT-FY-" + year + month + day;
    }
    
    // Method to calculate the TAT of Regular Investigation Process
    public Duration calculateRegularInvestigationProcessTAT(RegularInvestigationProcess regularInvestigationProcess) {
        Optional<RegularInvestigationProcess> rIP = regularInvestigationProcessRepository.findById(regularInvestigationProcess.getId());
        if (rIP.isPresent()) {
            RegularInvestigationProcess rIPObj = rIP.get();
            return Duration.between(rIPObj.getStartTime(), rIPObj.getEndTime());
        } else {
            return null;
        }
    }
}