package command.clase;

public class Operator {
	public void invoca(ICommand comanda) {
		comanda.executa();
	}
}
