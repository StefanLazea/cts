package clase;

public class ERRoom extends MedicalER{

	@Override
	public void check(Patient patient) {
		if(!patient.isTemperature()) {
			this.getNextMedical().check(patient);
		}else {
			System.out.println("We check other conditions");
		}
	}

}
