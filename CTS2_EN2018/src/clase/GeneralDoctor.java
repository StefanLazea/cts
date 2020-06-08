package clase;

public class GeneralDoctor extends MedicalER{

	@Override
	public void check(Patient patient) {
		if(!patient.isBleeding()) {
			this.getNextMedical().check(patient);
		}else {
			System.out.println("General doctor treats the patient" + patient.toString());
		}
	}

}
