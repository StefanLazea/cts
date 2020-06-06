package clase;

public class Program {

	public static void main(String[] args) {
		Pacient pacientNeasigurat = new Pacient("Ion", false);
		Pacient pacientAsigurat = new Pacient("George", true);

		Spital spital = new Spital();
		spital.interneaza(pacientAsigurat);
		spital.interneaza(pacientNeasigurat);
		
		SpitalProxy proxy = new SpitalProxy(spital);
		proxy.interneaza(pacientNeasigurat);
		proxy.interneaza(pacientAsigurat);

	}

}
