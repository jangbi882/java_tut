
public class Hospital2 {
	public static void main(String[] args) {

		PatientModel patientModel = new PatientModel("�Ƹ�", 38, "���ڱ� " + Doctor.ARMS+"�� ���Ŵϴ�.");
		Patient �Ƹ� = new Patient(patientModel);

		Doctor ���� = new Doctor(new DoctorModel("����", "�����е�", "���ð�"));

		����.requestTreatment(�Ƹ�);

	}
}
