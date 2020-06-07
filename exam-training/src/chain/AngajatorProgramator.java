package chain;

public class AngajatorProgramator extends AngajatorHandler {

	@Override
	public void angajeaza(Candidat candidat) {
		if (candidat.isCompetenteProgramare() && candidat.isCompetenteTestare()) {
			System.out.println(candidat.getNume() + " felicitari. Sunteti noul nostru programator!");
		} else {
			this.getNextAngajator().angajeaza(candidat);
		}
	}

}
