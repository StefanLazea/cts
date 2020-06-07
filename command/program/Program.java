package command.program;

import command.clase.ComandaConstituire;
import command.clase.ComandaDepunere;
import command.clase.ContBancar;
import command.clase.Operator;

public class Program {

	public static void main(String[] args) {
		ContBancar cont = new ContBancar("RO9NGB34324414141");
		
		Operator op = new Operator();
		ComandaConstituire constituire = new ComandaConstituire(cont);
		op.invoca(constituire);
		ComandaDepunere depunere = new ComandaDepunere(cont);
		op.invoca(depunere);
		op.undo();
	}

}
