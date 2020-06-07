package chain;

public class AngajatorTester extends AngajatorHandler {

	@Override
	public void angajeaza(Candidat candidat) {
		if (candidat.isCompetenteTestare()) {
			System.out.println("Esti misto testere, " + candidat.getNume() + "!");
		} else {
			this.getNextAngajator().angajeaza(candidat);
		}
	}
}
