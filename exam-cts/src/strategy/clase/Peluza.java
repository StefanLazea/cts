package strategy.clase;

public class Peluza implements ITipVerificare {

	@Override
	public void verifica(String numeSpectator) {
		System.out.println(numeSpectator + " se afla la peluza si a fost verificat atat biletul cat si bagajul");

	}

}
