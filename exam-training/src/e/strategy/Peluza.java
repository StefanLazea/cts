package e.strategy;

public class Peluza implements IModVerificare {

	@Override
	public void verifica(String numeSpectator) {
		System.out.println("Spectatorul " + numeSpectator + " a fost verificat la bagaje si haine");
	}

}
