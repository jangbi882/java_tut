
public class Doctor {

	private int state;

	private DoctorModel doctorModel;
	private Patient patient;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
		state = 1;
	}

	public void requestTreatment(Patient patient) {
		this.patient = patient;

		switch (state) {
		case 1:
			inquery();
			state++;
		case 2:
			treatment();
			state++;
			break;
		case 3:
			prescription();
			break;
		default:
		}

//		inquery();
//		treatment();
//		prescription();
	}

	private void inquery() {
		System.out.println(patient.talkMyName() + "��, ������ ��ȸ�� ���ڽ��ϴ�.");
		System.out.println(doctorModel.getName() + "(��)�� " + doctorModel.getComputer() + "���� ȯ���� ������ ��ȸ�մϴ�.");
	}

	private void treatment() {
		System.out.println(patient.talkMyTroubleType() + "..�׷��ñ���.");
		System.out.println(doctorModel.getName() + "(��)�� " + doctorModel.getMedicalAppliance() + "(��)�� ȯ�ڸ� �����մϴ�.");
	}

	private void prescription() {
		if (patient.talkMyAge() >= 20) {
			System.out.println(patient.talkMyAge() + "�� �̽ñ���. ���� ���� �帮�ڽ��ϴ�.");
		} else {
			System.out.println(patient.talkMyAge() + "�� �̽ñ���. ���� ���� �帮�ڽ��ϴ�.");
		}
		System.out.println(doctorModel.getName() + "(��)�� " + doctorModel.getComputer() + "(��)�� ȯ���� ó������ �ۼ��մϴ�.");
	}
}
