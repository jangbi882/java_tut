
public class Hospital {
	public static void main(String[] args) {
		Doctor doctor = new Doctor("±ËªÁ∫Œ", "superCom", "MRI");
		doctor.inquery();
		doctor.treatment();
		doctor.prescription();
		doctor.setComputer("");
		
		Doctor doctor2 = new Doctor("∫¿¥ﬁ»Ò", "Computer", "¡÷ªÁ±‚");
		doctor2.inquery();
	}
}
