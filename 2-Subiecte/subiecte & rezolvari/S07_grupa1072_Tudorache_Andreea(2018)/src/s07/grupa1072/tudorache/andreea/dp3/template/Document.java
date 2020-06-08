package s07.grupa1072.tudorache.andreea.dp3.template;

public class Document {
	private String denumire;
	private String extensie;
	private String text;
	private double dimensiune;
	
	public Document(String denumire, String extensie) {
		this.denumire = denumire;
		this.extensie = extensie;
	}

	public Document(String denumire, String extensie, String text, double dimensiune) {
		super();
		this.denumire = denumire;
		this.extensie = extensie;
		this.text = text;
		this.dimensiune = dimensiune;
	}


	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public double getDimensiune() {
		return dimensiune;
	}

	public void setDimensiune(double dimensiune) {
		this.dimensiune = dimensiune;
	}
	
	public String getExtensie() {
		return extensie;
	}

	public int calculNumarPagini() {
		return text.length() / 500;
	}
}