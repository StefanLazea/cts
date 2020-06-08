package s07.grupa1072.tudorache.andreea.unittests.clase;

public class Document {
	private String denumire;
	private String extensie;
	private String text;
	private double dimensiune;

	public Document(String denumire, String extensie) {
		this.denumire = denumire;
		this.extensie = extensie;
	}

	public Document() {
		super();
	}

	public Document(String denumire, String extensie, String text, double dimensiune) throws DocumentException {
		if (extensie.equals("poc") || extensie.equals("pocx") && dimensiune <= 100f && dimensiune >= 0f) {
			this.denumire = denumire;
			this.extensie = extensie;
			this.text = text;
			this.dimensiune = dimensiune;
		} else
			throw new DocumentException();
	}

	public void setExtensie(String extensie) throws DocumentException {
		if (extensie.equals("poc") || extensie.equals("pocx"))
			this.extensie = extensie;
		else
			throw new DocumentException();
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