package clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorPrimiriUrgente {
	private List<ICommand> comenzi = new ArrayList<ICommand>();
	private List<String> pacienti = new ArrayList<String>();

	public void invoca(ICommand command, String numePacient) {
		comenzi.add(command);
		pacienti.add(numePacient);
	}
	
	public void executaComenzi(int numarComenzi) {
		for(int i=0;i<numarComenzi;i++) {
			if(comenzi.size() > 0) {
				comenzi.get(0).executa(pacienti.get(0));
				comenzi.remove(0);
				pacienti.remove(0);
			}
		}
	}
}
