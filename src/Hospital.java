
public class Hospital {
	public static void main(String[] args) {

		Doctor[] doctors = new Doctor[3];
		doctors[0] = new Doctor(new DoctorModel("����", "�����е�", "���ð�"));
		doctors[1] = new Doctor(new DoctorModel("������", "��ǻ��", "û����"));
		doctors[2] = new Doctor(new DoctorModel("����", "���Ǻ���", "ħ"));

//		for (int i = 0; i < doctors.length; i++) {
//			doctors[i].inquery();
//			doctors[i].treatment();
//			doctors[i].prescription();
//		}
		
		for (Doctor doctor : doctors) {
//			doctor.inquery();
//			doctor.treatment();
//			doctor.prescription();
			
		}

	}
}
