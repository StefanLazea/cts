package d.state;

public class StareNuAreCard implements Stare {

	@Override
	public void doAction(Bancomat bancomat) {
		bancomat.setStare(this);
	}

}
