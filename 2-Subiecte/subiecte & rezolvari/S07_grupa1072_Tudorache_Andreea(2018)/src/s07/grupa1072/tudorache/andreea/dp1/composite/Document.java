package s07.grupa1072.tudorache.andreea.dp1.composite;

import s07.grupa1072.tudorache.andreea.dp2.memento.MementoDocument;

public class Document implements Optiune{
	
	private String nume;
	private String denumire;
	private String extensie;
	private String text;
	private double dimensiune;
	
	
	public Document (String nume)
	{
		this.nume=nume;
	}
	
	public void stergeNod(Optiune optiune) throws Exception
	{
		throw new Exception ("Nu este implementata");
	}
	
	public void adaugaNod(Optiune optiune) throws Exception
	{
		throw new Exception ("Nu este implementata");
	}
	
	public Optiune getNod (int index) throws Exception
	{
		throw new Exception ("Nu este implementata");
	}
	
	public void descriere ()
	{
		System.out.println(" Item: " + nume);
	}
	
	public Document(String denumire, String extensie) {
		this.denumire = denumire;
		this.extensie = extensie;
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