package s07.grupa1072.tudorache.andreea.dp2.memento;

public class Document {
	private String denumire;
	private String extensie;
	private String text;
	private double dimensiune;
	
	public Document(String denumire, String extensie) {
		this.denumire = denumire;
		this.extensie = extensie;
	}
	
	public MementoDocument salvareMemento()
	{
		return new MementoDocument(denumire, extensie, text, dimensiune);
	}
	
	public void undoToMemento(MementoDocument memento)
	{
		this.denumire = memento.getDenumire();
		this.extensie = memento.getExtensie();
		this.text = memento.getText();
		this.dimensiune = memento.getDimensiune();
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

	@Override
	public String toString() {
		return "Document [denumire=" + denumire + ", extensie=" + extensie + "]";
	}
	
	
}