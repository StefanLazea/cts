package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class OperatorService {
	private List<ICommand> comenzi;

	public OperatorService() {
		super();
		this.comenzi = new ArrayList<ICommand>();
	}
	
	//invoca
	public void add(ICommand comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executeCommand() {
		if(this.comenzi.size()>0) {
			ICommand command = this.comenzi.get(0);
			this.comenzi.remove(0);
			command.execute();
		}else {
			System.out.println("no commands found");
		}
	}
	
}
