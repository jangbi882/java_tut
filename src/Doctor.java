
public class Doctor {
	
	private String name;
	private String computer;
	private String medicalAppliance;

	public Doctor(String name, String computer, String medicalAppliance) {
		this.name = name;
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
	}
	
	public void inquery() {
		System.out.println(name+"(이)가 "+getComputer()+"에서 환자의 이름을 조회합니다.");
	}
	
	public void treatment() {
		System.out.println(name+"(이)가 "+medicalAppliance+"(으)로 환자를 진료합니다.");
	}
	
	public void prescription() {
		System.out.println(name+"(이)가 "+getComputer()+"(으)로 환자의 처방전을 작성합니다.");
	}

	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}
	

	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}
	
	public String getMedicalAppliance() {
		return medicalAppliance;
	}
}
