package e.flyweight;

public class Optionale {
	private String pozitie;
	private String culoare;
	public Optionale(String pozitie, String culoare) {
		super();
		this.pozitie = pozitie;
		this.culoare = culoare;
	}
	public String getPozitie() {
		return pozitie;
	}
	public String getCuloare() {
		return culoare;
	}
	public void setPozitie(String pozitie) {
		this.pozitie = pozitie;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	@Override
	public String toString() {
		return "Optionale [pozitie=" + pozitie + ", culoare=" + culoare + "]";
	}
	
	
	
}
