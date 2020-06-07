package e.strategy;

public class Tribuna implements IModVerificare{

	
	@Override
	public void verifica(String numeSpectator) {
		System.out.println("Spectatorul " + numeSpectator + " a fost verificat la bagaje");		
	}

}
