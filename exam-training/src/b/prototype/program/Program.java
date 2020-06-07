package b.prototype.program;

import b.prototype.Client;
import b.prototype.IClienti;

public class Program {

	public static void main(String[] args) {
		Client c = new Client("Ionel", 12);
		System.out.println(c.toString());
		
		IClienti c2 = c.copiaza();
		System.out.println(c2.toString());
	}

}
