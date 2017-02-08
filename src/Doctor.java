
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
		System.out.println(patient.talkMyName() + "님, 병적을 조회해 보겠습니다.");
		System.out.println(doctorModel.getName() + "(이)가 " + doctorModel.getComputer() + "에서 환자의 병적을 조회합니다.");
	}

	private void treatment() {
		System.out.println(patient.talkMyTroubleType() + "..그러시군요.");
		System.out.println(doctorModel.getName() + "(이)가 " + doctorModel.getMedicalAppliance() + "(으)로 환자를 진료합니다.");
	}

	private void prescription() {
		if (patient.talkMyAge() >= 20) {
			System.out.println(patient.talkMyAge() + "살 이시군요. 강한 약을 드리겠습니다.");
		} else {
			System.out.println(patient.talkMyAge() + "살 이시군요. 약한 약을 드리겠습니다.");
		}
		System.out.println(doctorModel.getName() + "(이)가 " + doctorModel.getComputer() + "(으)로 환자의 처방전을 작성합니다.");

		String troubleType = patient.talkMyTroubleType().toLowerCase();
		if (troubleType.indexOf(ARMS) >= 0) {
			System.out.println("깁스를 해 드릴께요.");
		} else if (troubleType.indexOf(SHOLDER) >= 0) {
			System.out.println("파스를 드릴께요.");
		} else {
			System.out.println("아픈 곳을 모르니 어쩔 수 없습니다.");
		}
	}
}
