package command.clase;

import java.util.Stack;

public class Operator {
	private Stack<ICommand> comenzi = new Stack<ICommand>();

	public void invoca(ICommand comanda) {
		comanda.execute();
		comenzi.push(comanda);
	}

	public void undo() {
		if (!this.comenzi.isEmpty()) {
			this.comenzi.pop().unexecute();
		}
	}
}
