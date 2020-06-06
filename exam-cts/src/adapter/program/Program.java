package adapter.program;

import adapter.clase.AdapterAplicatie;
import adapter.clase.AplicatieBilete;
import adapter.clase.IAplicatieBilete;
import adapter.de.clase.AdapterClaseAplicatie;
import adapter.ebilet.Ebilet;

public class Program {
	public static void rezervareSiVanzare(IAplicatieBilete app) {
		app.rezervareBilet();
		app.vanzareBilet();
	}
	
	public static void main(String[] args) {
		AplicatieBilete bilete = new AplicatieBilete(1, 200);
		rezervareSiVanzare(bilete);
		
		Ebilet appEbilet = new Ebilet(1, 43);
		AdapterAplicatie adapter = new AdapterAplicatie(appEbilet);
		rezervareSiVanzare(adapter);
		
		//adapter de clase
		
		AdapterClaseAplicatie adapterClase = new AdapterClaseAplicatie(2, 100);
		rezervareSiVanzare(adapterClase);
	}

}
