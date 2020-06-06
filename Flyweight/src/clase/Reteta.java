package clase;

public class Reteta {
	private int nrReteta;
	private float sumaReteta;
	private int nrMedicamente;
	
	public Reteta(int nrReteta, float sumaReteta, int nrMedicamente) {
		super();
		this.nrReteta = nrReteta;
		this.sumaReteta = sumaReteta;
		this.nrMedicamente = nrMedicamente;
	}

	public int getNrReteta() {
		return nrReteta;
	}

	public float getSumaReteta() {
		return sumaReteta;
	}

	public int getNrMedicamente() {
		return nrMedicamente;
	}

	public void setNrReteta(int nrReteta) {
		this.nrReteta = nrReteta;
	}

	public void setSumaReteta(float sumaReteta) {
		this.sumaReteta = sumaReteta;
	}

	public void setNrMedicamente(int nrMedicamente) {
		this.nrMedicamente = nrMedicamente;
	}

	@Override
	public String toString() {
		return "Reteta [nrReteta=" + nrReteta + ", sumaReteta=" + sumaReteta + ", nrMedicamente=" + nrMedicamente + "]";
	}
		
}
