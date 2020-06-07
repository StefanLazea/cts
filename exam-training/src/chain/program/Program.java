package chain.program;

import chain.AngajatorManager;
import chain.AngajatorProgramator;
import chain.AngajatorTester;
import chain.Candidat;
import chain.RaspunsNegativ;

public class Program {
	public static void main(String[] args) {
		AngajatorManager manager = new AngajatorManager();
		AngajatorProgramator programator = new AngajatorProgramator();
		AngajatorTester tester = new AngajatorTester();
		RaspunsNegativ raspuns = new RaspunsNegativ();

		manager.setNextAngajator(programator);
		programator.setNextAngajator(tester);
		tester.setNextAngajator(raspuns);

		Candidat c = new Candidat("Toma", false, false, false);
		Candidat c1 = new Candidat("Cristi", true, true, true);
		Candidat c2 = new Candidat("Ioana", false, true, true);
		Candidat c3 = new Candidat("Zamfi", false, false, true);

		manager.angajeaza(c);
		manager.angajeaza(c1);
		manager.angajeaza(c2);
		manager.angajeaza(c3);
	}
}
