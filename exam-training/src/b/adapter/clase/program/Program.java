package b.adapter.clase.program;

import b.adapter.clase.AdapterClase;
import b.adapter.clase.ISoft;
import b.adapter.clase.SoftVechi;
import b.adapter.clase.framwork.SoftNou;
import b.adapter.frameworkachizitionat.SoftBar;

public class Program {
	public static void nota(ISoft soft) {
		soft.vanzare();
	}
	
	public static void main(String[] args) {
		ISoft old = new SoftVechi("produs", 200);
		nota(old);
		ISoft nou = new AdapterClase(200, 2);
		nota(nou);
		
		
	}
}
