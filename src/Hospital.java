
public class Hospital {
	public static void main(String[] args) {
		DoctorModel info1 = new DoctorModel("±ËªÁ∫Œ", "superCom", "MRI");
		Doctor doctor = new Doctor(info1);
		doctor.inquery();
		doctor.treatment();
		doctor.prescription();
		
		DoctorModel info2 = new DoctorModel("∫¿¥ﬁ»Ò", "Computer", "¡÷ªÁ±‚");
		Doctor doctor2 = new Doctor(info2);
		doctor2.inquery();
	}
}
