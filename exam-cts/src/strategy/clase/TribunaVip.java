package strategy.clase;

public class TribunaVip implements ITipVerificare {

	@Override
	public void verifica(String numeSpectator) {
		System.out.println(numeSpectator + " se afla la Tribuna VIP si a fost verificat doar biletul");
	}

}
