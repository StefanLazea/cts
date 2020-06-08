package cts.examen.s2.pattern2;

public class testDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewPatient newPatient = new NewPatient("Dorel", false, false, 23);
		NewPatient newPatient2 = new NewPatient("Mirel", true, false, 23);
		
		if(newPatient2.isBleeding() == true) {
			PacientWithCompanion pacient = new PacientWithCompanion(newPatient2,"Mama");
			System.out.println(pacient.getDescription());
		}
	}

}
