package com.sacral.ilm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.sacral.ilm.entity.Case;
import com.sacral.ilm.repository.ReAllocateCaseRepository;

@Service
public class ReAllocateCaseService {
    @Autowired
    private ReAllocateCaseRepository reAllocateCaseRepository;

    public Optional<Case> findQueryByCaseId(Long caseId) {
        return reAllocateCaseRepository.findQueryByCaseId(caseId);
    }

    public List<Case> findCasesByInvestigatorType(String investigatorType) {
        return reAllocateCaseRepository.findCasesByInvestigatorType(investigatorType);
    }

    public void reAllocateCase(Long caseId, String investigatorType, String caseDetails, String remarks) {
        reAllocateCaseRepository.reAllocateCase(caseId, investigatorType, caseDetails, remarks);
    }

    public void sendEmail(SimpleMailMessage mailMessage) {
        // Code to send email
    }
}