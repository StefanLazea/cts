package clase;

public class Program {
	public static void main(String[] args) {
		Angajator manager = new AngajatorManager();
		Angajator tester = new AngajatorTester();
		Angajator programator = new AngajatorProgramator();
		Angajator raspunsNegativ = new RaspunsNegativ();

		manager.setNextAngajator(programator);
		programator.setNextAngajator(tester);
		tester.setNextAngajator(raspunsNegativ);

		Candidat candidat1 = new Candidat("Ion", true, true, true);
		Candidat candidat2 = new Candidat("George", false, false, false);
		Candidat candidat3 = new Candidat("Itachi", false, true, true);
		Candidat candidat4 = new Candidat("Sasuke", false, false, true);

		manager.angajare(candidat1);
		manager.angajare(candidat2);
		manager.angajare(candidat3);
		manager.angajare(candidat4);

	}
}
