package sources;


public class ElementGrafic {
	String tip;
	String imagine;
	
	public ElementGrafic(String tip, String imagine) {
		this.tip = tip;
		this.imagine = imagine;
		System.out.println("Incarcare imagine " + imagine);
	}
}
