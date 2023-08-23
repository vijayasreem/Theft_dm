package com.sacral.ilm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ilm.entity.Case;
import com.sacral.ilm.service.ReAllocateCaseService;

@RestController
@RequestMapping("/re-allocate-case")
public class ReAllocateCaseController {
    @Autowired
    private ReAllocateCaseService reAllocateCaseService;

    @GetMapping("/query/{caseId}")
    public Optional<Case> findQueryByCaseId(@PathVariable Long caseId) {
        return reAllocateCaseService.findQueryByCaseId(caseId);
    }

    @GetMapping("/investigator-type/{investigatorType}")
    public List<Case> findCasesByInvestigatorType(@PathVariable String investigatorType) {
        return reAllocateCaseService.findCasesByInvestigatorType(investigatorType);
    }

    @PostMapping("/re-allocate")
    public void reAllocateCase(@RequestBody Case reqCase) {
        Long caseId = reqCase.getCaseId();
        String investigatorType = reqCase.getInvestigatorType();
        String caseDetails = reqCase.getCaseDetails();
        String remarks = reqCase.getRemarks();
        reAllocateCaseService.reAllocateCase(caseId, investigatorType, caseDetails, remarks);
    }

    @PostMapping("/email")
    public void sendEmail(@RequestBody SimpleMailMessage mailMessage) {
        reAllocateCaseService.sendEmail(mailMessage);
    }
}