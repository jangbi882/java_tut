
public class Doctor {
	
	private DoctorModel doctorModel;
	
	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}
	
	public void inquery() {
		System.out.println(doctorModel.getName() +"(��)�� "+ doctorModel.getComputer()+"���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}
	
	public void treatment() {
		System.out.println(doctorModel.getName()+"(��)�� "+doctorModel.getMedicalAppliance()+"(��)�� ȯ�ڸ� �����մϴ�.");
	}
	
	public void prescription() {
		System.out.println(doctorModel.getName()+"(��)�� "+doctorModel.getComputer()+"(��)�� ȯ���� ó������ �ۼ��մϴ�.");
	}
}
