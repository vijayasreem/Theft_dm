package com.sacral.ilm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ilm.repository.Process;
import com.sacral.ilm.repository.TheftInvestigationRepository;

@Service
public class TheftInvestigationService {

    @Autowired
    private TheftInvestigationRepository theftInvestigationRepository;

    public Optional<Process> findByClaimValueLessThanEqualAndTat(Long claimValue, Integer tat) {
        return theftInvestigationRepository.findByClaimValueLessThanEqualAndTat(claimValue, tat);
    }

    public List<Process> findByVirtualInvestigationProcessAndRegularInvestigationProcess(Boolean virtualInvestigationProcess, Boolean regularInvestigationProcess) {
        return theftInvestigationRepository.findByVirtualInvestigationProcessAndRegularInvestigationProcess(virtualInvestigationProcess, regularInvestigationProcess);
    }

    public List<Process> findByAllocatedToInternalAndExternalInvestigator(Boolean internalInvestigator, Boolean externalInvestigator) {
        return theftInvestigationRepository.findByAllocatedToInternalAndExternalInvestigator(internalInvestigator, externalInvestigator);
    }

    public Process findByGenerateInvoiceOption(Boolean generateInvoice) {
        return theftInvestigationRepository.findByGenerateInvoiceOption(generateInvoice);
    }
}