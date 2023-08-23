package com.sacral.ilm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ilm.model.TwoWheelerCases;
import com.sacral.ilm.repository.TwoWheelerCaseRepository;

@Service
public class TwoWheelerCaseService {

    @Autowired
    TwoWheelerCaseRepository twoWheelerCaseRepository;

    public TwoWheelerCases triggerProcess(String process) {
        return twoWheelerCaseRepository.findByTriggerProcess(process);
    }

    public TwoWheelerCases findByClaimValue(int value) {
        return twoWheelerCaseRepository.findByClaimValue(value);
    }

    public TwoWheelerCases allocateProcess(String allocate) {
        return twoWheelerCaseRepository.findByAllocateProcess(allocate);
    }

    public TwoWheelerCases generateInvoice(boolean generate) {
        return twoWheelerCaseRepository.findByGenerateInvoice(generate);
    }

    public TwoWheelerCases setTAT(int tat) {
        return twoWheelerCaseRepository.findByTAT(tat);
    }

    public List<TwoWheelerCases> getAllCases() {
        return twoWheelerCaseRepository.findAll();
    }
}