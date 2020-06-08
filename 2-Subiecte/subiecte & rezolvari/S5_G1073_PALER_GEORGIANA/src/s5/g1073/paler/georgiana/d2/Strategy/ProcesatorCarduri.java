package s5.g1073.paler.georgiana.d2.Strategy;

import sources.IPlata;

public class ProcesatorCarduri implements IPlata {

	@Override
	public void plateste(float valoareCos) {
		System.out.println("Plata se face prin card procesator.");
	}

}
