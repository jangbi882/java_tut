
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
		System.out.println(name+"(��)�� "+getComputer()+"���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}
	
	public void treatment() {
		System.out.println(name+"(��)�� "+medicalAppliance+"(��)�� ȯ�ڸ� �����մϴ�.");
	}
	
	public void prescription() {
		System.out.println(name+"(��)�� "+getComputer()+"(��)�� ȯ���� ó������ �ۼ��մϴ�.");
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
