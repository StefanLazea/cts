package c.facade.program;

import c.facade.clase.Client;
import c.facade.clase.Facade;

public class Program {

	public static void main(String[] args) {
		Facade facade = new Facade();
		Client c = new Client(12, "aoo");
		facade.verificaClient(c);
	}

}
