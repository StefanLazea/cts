package s3.g1079.paris.iannis.command;

import java.util.ArrayList;

public abstract class Invoker {
	private ArrayList<Inspection> listaInspectii = new ArrayList<>();
	protected String numeMecanic;
	protected Receiver r;
	
	
	public Invoker(String numeMecanic,Receiver r) {
		super();
		this.numeMecanic = numeMecanic;
	}
	
	public void adaugaComanda(Inspection o) {
		listaInspectii.add(o);
	}
	
	public void trimiteComenzile() {
		for(Inspection o : listaInspectii) {
			o.detaliiInspectie();
		}
	}
}
