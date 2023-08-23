package com.sacral.ilm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ilm.service.TheftInvestigationService;

@RestController
public class TheftInvestigationController {

    @Autowired
    private TheftInvestigationService theftInvestigationService;

    @GetMapping("/api/findByClaimValueLessThanEqualAndTat/{claimValue}/{tat}")
    public Optional<Process> findByClaimValueLessThanEqualAndTat(@PathVariable("claimValue") Long claimValue, @PathVariable("tat") Integer tat) {
        return theftInvestigationService.findByClaimValueLessThanEqualAndTat(claimValue, tat);
    }

    @GetMapping("/api/findByVirtualInvestigationProcessAndRegularInvestigationProcess")
    public List<Process> findByVirtualInvestigationProcessAndRegularInvestigationProcess(@RequestParam boolean virtualInvestigationProcess, @RequestParam boolean regularInvestigationProcess) {
        return theftInvestigationService.findByVirtualInvestigationProcessAndRegularInvestigationProcess(virtualInvestigationProcess, regularInvestigationProcess);
    }

    @GetMapping("/api/findByAllocatedToInternalAndExternalInvestigator")
    public List<Process> findByAllocatedToInternalAndExternalInvestigator(@RequestParam boolean internalInvestigator, @RequestParam boolean externalInvestigator) {
        return theftInvestigationService.findByAllocatedToInternalAndExternalInvestigator(internalInvestigator, externalInvestigator);
    }

    @GetMapping("/api/findByGenerateInvoiceOption/{generateInvoice}")
    public Process findByGenerateInvoiceOption(@PathVariable("generateInvoice") Boolean generateInvoice) {
        return theftInvestigationService.findByGenerateInvoiceOption(generateInvoice);
    }

}