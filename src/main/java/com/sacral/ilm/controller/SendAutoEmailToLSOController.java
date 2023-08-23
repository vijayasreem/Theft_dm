package com.sacral.ilm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ilm.service.SendAutoEmailToLSOService;

@RestController
@RequestMapping("/email")
public class SendAutoEmailToLSOController {
	
	@Autowired
	private SendAutoEmailToLSOService sendAutoEmailToLSOService;
	
	@PostMapping("/send")
	public ResponseEntity<String> sendEmail(@RequestBody String caseDetails, String remarks, String caseRecords) {
		sendAutoEmailToLSOService.sendEmailToLSO(caseDetails, remarks, caseRecords);
		return new ResponseEntity<>("Email Sent Successfully", HttpStatus.OK);
	}
	
	@PostMapping("/sendWithinTimeFrame")
	public ResponseEntity<String> sendEmailWithinTimeFrame(@RequestBody String timeFrame) {
		sendAutoEmailToLSOService.sendEmailWithinTimeFrame(timeFrame);
		return new ResponseEntity<>("Email Sent Successfully", HttpStatus.OK);
	}

}