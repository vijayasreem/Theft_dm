package com.sacral.ilm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.ilm.model.TwoWheelerCases;

@Repository
public interface TwoWheelerCaseRepository extends JpaRepository<TwoWheelerCases, Long> {

    // Method to trigger the Virtual Investigation Process (Auto/Manual/Self-Analytics) from “Opus” to ILM for Investigation
    TwoWheelerCases findByTriggerProcess(String process);
	
    // Method to get Two-Wheeler cases with claim value “<= 50k”
    TwoWheelerCases findByClaimValue(int value);
	
    // Method to allocate the Virtual Investigation Process to both Internal and External (virtual) investigators
    TwoWheelerCases findByAllocateProcess(String allocate);
	
    // Method to generate invoice for external investigator
    TwoWheelerCases findByGenerateInvoice(boolean generate);
	
    // Method to set the TAT of 8 days
    TwoWheelerCases findByTAT(int tat);
}