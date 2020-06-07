package strategy.clase;

public class Tribuna implements ITipVerificare {

	@Override
	public void verifica(String numeSpectator) {
		System.out.println(numeSpectator + " se afla la tribuna si a fost verificat doar bagajul");		
	}

}
