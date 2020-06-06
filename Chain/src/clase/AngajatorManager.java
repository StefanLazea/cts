package clase;

public class AngajatorManager extends Angajator {

	@Override
	public void angajare(Candidat candidat) {
		if (candidat.getAreCompManageriale() && candidat.getAreCompProgramare() && candidat.getAreCompTestare()) {
			System.out.println("Candidatul " + candidat.getNume() + " este angajat pe pozitia de manager");
		}else {
			super.getNextAngajator().angajare(candidat);
		}
	}

}
