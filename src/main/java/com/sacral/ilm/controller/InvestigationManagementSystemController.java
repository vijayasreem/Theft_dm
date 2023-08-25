package com.sacral.ilm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ilm.model.InvestigationManagementSystem;
import com.sacral.ilm.service.InvestigationManagementSystemService;

@RestController
@RequestMapping("/investigation-management-system")
public class InvestigationManagementSystemController {
    
    @Autowired
    private InvestigationManagementSystemService investigationManagementSystemService;

    @PostMapping("/allocate-cases")
    public List<InvestigationManagementSystem> allocateCases() {
        return investigationManagementSystemService.allocateCases();
    }

    @PostMapping("/generate-invoices")
    public List<InvestigationManagementSystem> generateInvoices() {
        return investigationManagementSystemService.generateInvoices();
    }

    @PostMapping("/submit-reports")
    public List<InvestigationManagementSystem> submitReports() {
        return investigationManagementSystemService.submitReports();
    }

    @PostMapping("/send-emails-and-notifications")
    public List<InvestigationManagementSystem> sendEmailsAndNotifications() {
        return investigationManagementSystemService.sendEmailsAndNotifications();
    }

    @PostMapping("/waive-off-cases")
    public List<InvestigationManagementSystem> waiveOffCases() {
        return investigationManagementSystemService.waiveOffCases();
    }

    @PostMapping("/maintain-history")
    public List<InvestigationManagementSystem> maintainHistory() {
        return investigationManagementSystemService.maintainHistory();
    }
}