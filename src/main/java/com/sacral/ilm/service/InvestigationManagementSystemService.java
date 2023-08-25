package com.sacral.ilm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ilm.repository.InvestigationManagementSystemRepository;
import com.sacral.ilm.model.InvestigationManagementSystem;

@Service
public class InvestigationManagementSystemService {

    @Autowired
    private InvestigationManagementSystemRepository investigationManagementSystemRepository;

    // Method to allocate cases to Internal and External (virtual) investigators
    public List<InvestigationManagementSystem> allocateCases() {
        return investigationManagementSystemRepository.allocateCases();
    }

    // Method to generate invoices for external investigators
    public List<InvestigationManagementSystem> generateInvoices() {
        return investigationManagementSystemRepository.generateInvoices();
    }

    // Method to submit reports to LSO and Claims team
    public List<InvestigationManagementSystem> submitReports() {
        return investigationManagementSystemRepository.submitReports();
    }

    // Method to send emails and notifications to users
    public List<InvestigationManagementSystem> sendEmailsAndNotifications() {
        return investigationManagementSystemRepository.sendEmailsAndNotifications();
    }

    // Method to waive-off cases
    public List<InvestigationManagementSystem> waiveOffCases() {
        return investigationManagementSystemRepository.waiveOffCases();
    }

    // Method to maintain the history of the cases
    public List<InvestigationManagementSystem> maintainHistory() {
        return investigationManagementSystemRepository.maintainHistory();
    }

}