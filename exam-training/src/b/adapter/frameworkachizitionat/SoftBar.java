package b.adapter.frameworkachizitionat;

public class SoftBar {
	private String denumireProdus;
	private float cost;

	public SoftBar(String denumireProdus, float cost) {
		super();
		this.denumireProdus = denumireProdus;
		this.cost = cost;
	}

	public String getDenumireProdus() {
		return denumireProdus;
	}

	public float getCost() {
		return cost;
	}

	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void printeaza() {
		System.out.println("Am printat " + this.denumireProdus + "avand costul " + this.cost);
	}

	@Override
	public String toString() {
		return "SoftBar [denumireProdus=" + denumireProdus + ", cost=" + cost + "]";
	}

}
