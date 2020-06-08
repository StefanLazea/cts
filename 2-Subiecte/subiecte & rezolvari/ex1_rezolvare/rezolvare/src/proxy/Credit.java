package proxy;

import clase.Client;

public class Credit implements ICredit {

	@Override
	public void acordaCredit(Client client) {
		System.out.println(client.getNume() + " a dorit contractarea unui credit.");
	}

}
