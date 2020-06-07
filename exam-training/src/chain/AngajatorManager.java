package chain;

public class AngajatorManager extends AngajatorHandler {

	@Override
	public void angajeaza(Candidat candidat) {
		if (candidat.isCompetenteManageriale() && candidat.isCompetenteProgramare() && candidat.isCompetenteTestare()) {
			System.out.println(candidat.getNume() + " felicitari! Ai fost angajat la TOMA SRL pe pozitia Manager");
		} else {
			this.getNextAngajator().angajeaza(candidat);
		}

	}

}
