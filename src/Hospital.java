
public class Hospital {
	public static void main(String[] args) {

		Doctor[] doctors = new Doctor[3];
		doctors[0] = new Doctor(new DoctorModel("김사부", "아이패드", "내시경"));
		doctors[1] = new Doctor(new DoctorModel("봉달희", "컴퓨터", "청진기"));
		doctors[2] = new Doctor(new DoctorModel("허준", "동의보감", "침"));

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
