package program;

import clase.ComandaInternare;
import clase.ComandaTratare;
import clase.ICommand;
import clase.Medic;
import clase.OperatorPrimiriUrgente;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medic mInternist = new Medic("Medic Internist");
		Medic mGeneralist = new Medic("Medic Generalist");

		OperatorPrimiriUrgente operator = new OperatorPrimiriUrgente();

		ICommand comanda1 = new ComandaInternare(mInternist);
		operator.invoca(comanda1, "Gigel");
		ICommand comanda2 = new ComandaTratare(mGeneralist);
		operator.invoca(comanda2, "George");
		
		operator.executaComenzi(1);
		ICommand comanda3 = new ComandaTratare(mGeneralist);
		operator.invoca(comanda3, "Misu");

		operator.executaComenzi(3);

	}

}
