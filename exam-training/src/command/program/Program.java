package command.program;

import command.clase.ComandaRezervare;
import command.clase.Masa;
import command.clase.Operator;

public class Program {

	public static void main(String[] args) {
		Operator op = new Operator();
		Masa m = new Masa(1);
		
		ComandaRezervare rezervare = new ComandaRezervare(m);
		op.invoca(rezervare);
		
	}

}
