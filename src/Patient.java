
public class Patient {
	
	private PatientModel patientModel;

	public Patient(PatientModel patientModel) {
		super();
		this.patientModel = patientModel;
	}
	
	public int talkMyAge() {
		return patientModel.getAge();
	}
	
	public String talkMyName() {
		return patientModel.getName();
	}
	
	public String talkMyTroubleType() {
		return patientModel.getTroubleType();
	}

}
