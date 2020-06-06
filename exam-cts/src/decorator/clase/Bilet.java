package decorator.clase;

public class Bilet implements IBilet {
	private String serie;

	public Bilet(String serie) {
		super();
		this.serie = serie;
	}

	@Override
	public void printeazaBilet() {
		System.out.println("S-a printat biletul cu seria." + this.serie);
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}
