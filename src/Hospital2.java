
public class Hospital2 {
	public static void main(String[] args) {

		PatientModel patientModel = new PatientModel("아모개", 38, "갑자기 " + Doctor.ARMS+"가 아픕니다.");
		Patient 아모개 = new Patient(patientModel);

		Doctor 김사부 = new Doctor(new DoctorModel("김사부", "아이패드", "내시경"));

		김사부.requestTreatment(아모개);

	}
}
