package e.strategy;

public class TribunaVip implements IModVerificare{

	@Override
	public void verifica(String numeSpectator) {
		System.out.println("Spectatorului " + numeSpectator + " i-a fost verificat biletul ");	
	}

}
