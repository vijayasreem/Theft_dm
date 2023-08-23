package com.sacral.ilm.controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ilm.model.RegularInvestigationProcess;
import com.sacral.ilm.service.RegularInvestigationProcessService;

@RestController
@RequestMapping("regularInvestigationProcess")
public class RegularInvestigationProcessController {
    
    @Autowired
    private RegularInvestigationProcessService regularInvestigationProcessService;
    
    // Method to trigger Regular Investigation Process from “Opus” to ILM system for investigation process
    @PostMapping("/trigger")
    public RegularInvestigationProcess triggerRegularInvestigationProcess(@RequestParam("trigger") String trigger) {
        return regularInvestigationProcessService.triggerRegularInvestigationProcess(trigger);
    }
    
    // Method to allocate Regular Investigation Process based upon “Location code, Product Code and Claim Amount”
    @PostMapping("/allocate")
    public RegularInvestigationProcess allocateRegularInvestigationProcess(@RequestParam("locationCode") String locationCode,
                                                                         @RequestParam("productCode") String productCode,
                                                                         @RequestParam("claimAmount") double claimAmount) {
        return regularInvestigationProcessService.allocateRegularInvestigationProcess(locationCode, productCode, claimAmount);
    }
    
    // Method to get the TAT of Regular Investigation Process
    @PostMapping("/tat")
    public int getRegularInvestigationProcessTAT() {
        return regularInvestigationProcessService.getRegularInvestigationProcessTAT();
    }
    
    // Method to get the Investigation format of Regular Investigation Process
    @PostMapping("/format")
    public String getRegularInvestigationProcessFormat() {
        return regularInvestigationProcessService.getRegularInvestigationProcessFormat();
    }
    
    // Method to generate Investigation format of “INV-MTR-THEFT-FY-XXXXXX” for the Regular Investigation Process
    @PostMapping("/generate-format")
    public String generateRegularInvestigationProcessFormat() {
        return regularInvestigationProcessService.generateRegularInvestigationProcessFormat();
    }
    
    // Method to calculate the TAT of Regular Investigation Process
    @PostMapping("/calculate-tat")
    public Duration calculateRegularInvestigationProcessTAT(@RequestParam("regularInvestigationProcess") RegularInvestigationProcess regularInvestigationProcess) {
        return regularInvestigationProcessService.calculateRegularInvestigationProcessTAT(regularInvestigationProcess);
    }
}