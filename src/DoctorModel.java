
public class DoctorModel {
	/**
	 * 데이터베이스의 값들을 바인딩 함
	 * 
	 * @author
	 */

	private String name;
	private String computer;
	private String medicalAppliance;
	
	public DoctorModel() {
	}

	public DoctorModel(String name, String computer, String medicalAppliance) {
		this.name = name;
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	public String getMedicalAppliance() {
		return medicalAppliance;
	}

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}

}
