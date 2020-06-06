package clase;

public class AngajatorTester extends Angajator {

	@Override
	public void angajare(Candidat candidat) {
		if (candidat.getAreCompTestare()) {
			System.out.println("Candidatul " + candidat.getNume() + " este angajat pe pozitia de tester");
		}else {
			super.getNextAngajator().angajare(candidat);
		}		
	}

}
