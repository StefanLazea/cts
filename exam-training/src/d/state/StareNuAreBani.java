package d.state;

public class StareNuAreBani implements Stare {

	@Override
	public void doAction(Bancomat bancomat) {
		bancomat.setStare(this);
	}

}
