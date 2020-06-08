package s07.grupa1072.tudorache.andreea.dp2.memento;

public class MementoDocument {
	
	private String denumire;
	private String extensie;
	private String text;
	private double dimensiune;
	
	public MementoDocument(String denumire, String extensie, String text, double dimensiune) {
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
	
	public String getExtensie() {
		return extensie;
	}
	
	public void setExtensie(String extensie) {
		this.extensie = extensie;
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
	
}