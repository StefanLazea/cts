package b.adapter;

public class SoftBucatarie {
	private String denumireServiciu;
	private float pretFinal;

	public SoftBucatarie(String denumireServiciu, float pretFinal) {
		super();
		this.denumireServiciu = denumireServiciu;
		this.pretFinal = pretFinal;
	}

	public String getDenumireServiciu() {
		return denumireServiciu;
	}

	public float getPretFinal() {
		return pretFinal;
	}

	public void setDenumireServiciu(String denumireServiciu) {
		this.denumireServiciu = denumireServiciu;
	}

	public void setPretFinal(float pretFinal) {
		this.pretFinal = pretFinal;
	}

	@Override
	public String toString() {
		return "SoftBucatarie [denumireServiciu=" + denumireServiciu + ", pretFinal=" + pretFinal + "]";
	}

	public void afisareNota() {
		System.out.println("Nota pentru " + this.denumireServiciu + " cu pretul " + this.pretFinal);
	}
}
