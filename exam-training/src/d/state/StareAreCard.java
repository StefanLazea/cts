package d.state;

public class StareAreCard implements Stare {

	@Override
	public void doAction(Bancomat bancomat) {
		bancomat.setStare(this);
	}

}
