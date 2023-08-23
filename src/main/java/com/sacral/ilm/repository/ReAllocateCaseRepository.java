package com.sacral.ilm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sacral.ilm.entity.Case;

public interface ReAllocateCaseRepository extends JpaRepository<Case, Long> {

    @Modifying
    @Query("update Case c set c.investigatorType = ?2, c.caseDetails = ?3, c.remarks = ?4 where c.id = ?1")
    void reAllocateCase(Long caseId, String investigatorType, String caseDetails, String remarks);
    
    @Query("select c from Case c where c.id = ?1")
    Case findQueryByCaseId(Long caseId);
    
    @Query("select c from Case c where c.investigatorType = ?1")
    Case findCasesByInvestigatorType(String investigatorType);
    
}