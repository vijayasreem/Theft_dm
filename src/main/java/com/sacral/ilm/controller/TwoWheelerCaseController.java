package com.sacral.ilm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ilm.model.TwoWheelerCases;
import com.sacral.ilm.service.TwoWheelerCaseService;

@RestController
public class TwoWheelerCaseController {
	
	@Autowired
	TwoWheelerCaseService twoWheelerCaseService;
	
	@GetMapping("/triggerProcess")
	public TwoWheelerCases triggerProcess(@RequestParam String process) {
		return twoWheelerCaseService.triggerProcess(process);
	}
	
	@PostMapping("/findByClaimValue")
	public TwoWheelerCases findByClaimValue(@RequestParam int value) {
		return twoWheelerCaseService.findByClaimValue(value);
	}
	
	@GetMapping("/allocateProcess")
	public TwoWheelerCases allocateProcess(@RequestParam String allocate) {
		return twoWheelerCaseService.allocateProcess(allocate);
	}
	
	@PostMapping("/generateInvoice")
	public TwoWheelerCases generateInvoice(@RequestParam boolean generate) {
		return twoWheelerCaseService.generateInvoice(generate);
	}
	
	@PostMapping("/setTAT")
	public TwoWheelerCases setTAT(@RequestParam int tat) {
		return twoWheelerCaseService.setTAT(tat);
	}
	
	@GetMapping("/getAllCases")
	public List<TwoWheelerCases> getAllCases() {
		return twoWheelerCaseService.getAllCases();
	}
	
}