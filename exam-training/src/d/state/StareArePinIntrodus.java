package d.state;

public class StareArePinIntrodus implements Stare {

	@Override
	public void doAction(Bancomat bancomat) {
		bancomat.setStare(this);
	}

}
