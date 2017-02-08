
public class Doctor {

	public static final String SHOLDER = "sholder";
	public static final String ARMS = "arms";

	private int state;

	private DoctorModel doctorModel;
	private Patient patient;

	public Doctor(DoctorModel doctorModel) {
		this.doctorModel = doctorModel;
		state = 1;
	}

	public void requestTreatment(Patient patient) {
		this.patient = patient;

		// switch (state) {
		// case 1:
		// inquery();
		// state++;
		// case 2:
		// treatment();
		// state++;
		// break;
		// case 3:
		// prescription();
		// break;
		// default:
		// }

		inquery();
		treatment();
		prescription();
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

		String troubleType = patient.talkMyTroubleType().toLowerCase();
		if (troubleType.indexOf(ARMS) >= 0) {
			System.out.println("�齺�� �� �帱����.");
		} else if (troubleType.indexOf(SHOLDER) >= 0) {
			System.out.println("�Ľ��� �帱����.");
		} else {
			System.out.println("���� ���� �𸣴� ��¿ �� �����ϴ�.");
		}
	}
}
