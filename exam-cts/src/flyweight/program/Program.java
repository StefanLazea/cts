package flyweight.program;

import flyweight.clase.FabricaSperctatori;
import flyweight.clase.ISpectator;
import flyweight.clase.Optionale;
import flyweight.clase.Spectator;

public class Program {
	public static void afisare() {
		ISpectator persoana = FabricaSperctatori.getSpectator("Ion", "1.80", "60");
		Optionale op = new Optionale("sud vest", "negru");
		persoana.descriePublic(op);
	}

	public static void main(String[] args) {
		afisare();
		
		ISpectator persoana = FabricaSperctatori.getSpectator("Ion", "1.80", "60");
		Optionale op = new Optionale("sud vest", "negru");
		
		System.out.println(FabricaSperctatori.getNumarSpectatori());

	}

}
