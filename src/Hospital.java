
public class Hospital {
	public static void main(String[] args) {
		Doctor doctor = new Doctor("����", "superCom", "MRI");
		doctor.inquery();
		doctor.treatment();
		doctor.prescription();
		doctor.setComputer("");
		
		Doctor doctor2 = new Doctor("������", "Computer", "�ֻ��");
		doctor2.inquery();
	}
}
