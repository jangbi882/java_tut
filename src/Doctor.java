
public class Doctor {
	
	private DoctorModel doctorModel;
	
	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
	}
	
	public void inquery() {
		System.out.println(doctorModel.getName() +"(이)가 "+ doctorModel.getComputer()+"에서 환자의 이름을 조회합니다.");
	}
	
	public void treatment() {
		System.out.println(doctorModel.getName()+"(이)가 "+doctorModel.getMedicalAppliance()+"(으)로 환자를 진료합니다.");
	}
	
	public void prescription() {
		System.out.println(doctorModel.getName()+"(이)가 "+doctorModel.getComputer()+"(으)로 환자의 처방전을 작성합니다.");
	}
}
