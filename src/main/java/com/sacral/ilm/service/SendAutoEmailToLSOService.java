package com.sacral.ilm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sacral.ilm.repository.SendAutoEmailToLSORepository;

@Service
public class SendAutoEmailToLSOService {

	@Autowired
	private SendAutoEmailToLSORepository sendAutoEmailToLSORepository;

	public void sendEmailToLSO(String caseDetails, String remarks, String caseRecords) {
		if (!StringUtils.isEmpty(caseDetails) && !StringUtils.isEmpty(remarks)) {
			sendAutoEmailToLSORepository.sendEmailToLSO(caseDetails, remarks, caseRecords);
		}
	}

	public void sendEmailWithinTimeFrame(String timeFrame) {
		if (!StringUtils.isEmpty(timeFrame)) {
			sendAutoEmailToLSORepository.sendEmailWithinTimeFrame(timeFrame);
		}
	}

}