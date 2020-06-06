package flyweight.clase;

public class Public implements IPublic {
	private String denumireStadion;
	private String tribuna;

	public Public(String denumireStadion, String tribuna) {
		super();
		this.denumireStadion = denumireStadion;
		this.tribuna = tribuna;
	}

	public String getDenumireStadion() {
		return denumireStadion;
	}

	public String getTribuna() {
		return tribuna;
	}

	public void setDenumireStadion(String denumireStadion) {
		this.denumireStadion = denumireStadion;
	}

	public void setTribuna(String tribuna) {
		this.tribuna = tribuna;
	}

	@Override
	public void descriePublic(Optionale optionale) {
		System.out.println("Jocul se desfasoara pe stadionul");
	}

}
