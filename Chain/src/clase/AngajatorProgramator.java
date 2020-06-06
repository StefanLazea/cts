package clase;

public class AngajatorProgramator extends Angajator {

	@Override
	public void angajare(Candidat candidat) {
		if (candidat.getAreCompProgramare()) {
			System.out.println("Candidatul " + candidat.getNume() + " este angajat pe pozitia de programare");
		}else {
			super.getNextAngajator().angajare(candidat);
		}
	}

}
