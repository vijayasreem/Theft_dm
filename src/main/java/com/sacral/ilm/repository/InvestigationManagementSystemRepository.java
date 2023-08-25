package com.sacral.ilm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestigationManagementSystemRepository extends JpaRepository<InvestigationManagementSystem, Long> {
 
    // Method to allocate cases to Internal and External (virtual) investigators
    List<InvestigationManagementSystem> allocateCases();
 
    // Method to generate invoices for external investigators
    List<InvestigationManagementSystem> generateInvoices();
	
    // Method to submit reports to LSO and Claims team
    List<InvestigationManagementSystem> submitReports();
	
    // Method to send emails and notifications to users
    List<InvestigationManagementSystem> sendEmailsAndNotifications();
	
    // Method to waive-off cases
    List<InvestigationManagementSystem> waiveOffCases();
	
    // Method to maintain the history of the cases
    List<InvestigationManagementSystem> maintainHistory();
}