
public class ObiectivTuristic{
	private String denumireObiectiv;
	private float pretBiletAdult;
	private float pretBiletElev;

	public ObiectivTuristic(String denumireObiectiv, float pretBiletAdult, float pretBiletElev) {
		this.denumireObiectiv = denumireObiectiv;
		this.pretBiletAdult = pretBiletAdult;
		this.pretBiletElev = pretBiletElev;
	}

	@Override
	public String toString() {
		return "ObiectivTuristic [denumireObiectiv=" + denumireObiectiv + ", pretBiletAdult=" + pretBiletAdult
				+ ", pretBiletElev=" + pretBiletElev + "]";
	}

	@Override
	public void descriere() {
		System.out.println(this.toString());
	}

}
