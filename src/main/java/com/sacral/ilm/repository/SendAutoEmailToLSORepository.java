@Repository
public interface SendAutoEmailToLSORepository {

	void sendEmailToLSO(String caseDetails, String remarks, String caseRecords);

	void sendEmailWithinTimeFrame(String timeFrame);

}