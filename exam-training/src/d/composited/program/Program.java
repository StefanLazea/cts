package d.composited.program;

import d.composite.Agentie;
import d.composite.Filiala;

public class Program {

	public static void main(String[] args) {
		Agentie sucursalaB = new Agentie("Sucursala Bucuresti");
		Agentie sucursalaP = new Agentie("Sucursala Pitesti");
		
		Filiala filialaTitan = new Filiala("Filiala Titan");
		Filiala filialaRazboieni = new Filiala("Filiala Razboieni");
		
		Agentie sucursalaPVest = new Agentie("Sub-sucursala Pitesti vest");

		
		sucursalaB.adaugaNod(filialaTitan);
		
		sucursalaP.adaugaNod(filialaRazboieni);
		sucursalaP.adaugaNod(sucursalaPVest);
		sucursalaPVest.adaugaNod(filialaRazboieni);
		
//		sucursalaB.descriere("");
		sucursalaP.descriere("");

	}

}
