package com.sacral.ilm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TheftInvestigationRepository extends JpaRepository<Process, Long> {

    Optional<Process> findByClaimValueLessThanEqualAndTat(Long claimValue, Integer tat);

    List<Process> findByVirtualInvestigationProcessAndRegularInvestigationProcess(Boolean virtualInvestigationProcess, Boolean regularInvestigationProcess);

    List<Process> findByAllocatedToInternalAndExternalInvestigator(Boolean internalInvestigator, Boolean externalInvestigator);

    Process findByGenerateInvoiceOption(Boolean generateInvoice);
}