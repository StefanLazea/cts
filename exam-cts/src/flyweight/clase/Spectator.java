package flyweight.clase;

public class Spectator implements ISpectator {
	private String nume;
	private String inaltime;
	private String latime;

	public Spectator(String nume, String inaltime, String latime) {
		super();
		this.nume = nume;
		this.inaltime = inaltime;
		this.latime = latime;
	}

	public String getNume() {
		return nume;
	}

	public String getInaltime() {
		return inaltime;
	}

	public String getLatime() {
		return latime;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setInaltime(String inaltime) {
		this.inaltime = inaltime;
	}

	public void setLatime(String latime) {
		this.latime = latime;
	}

	@Override
	public void descriePublic(Optionale optionale) {
		System.out.println("Public [nume=" + nume + ", inaltime=" + inaltime + ", latime=" + latime + "]"
				+ " are si " + optionale.toString());
	}

}
