package clase;

public abstract class MedicalER {
	private MedicalER nextMedical;

	public MedicalER getNextMedical() {
		return nextMedical;
	}

	public void setNextMedical(MedicalER nextMedical) {
		this.nextMedical = nextMedical;
	}

	public abstract void check(Patient patient);
}
