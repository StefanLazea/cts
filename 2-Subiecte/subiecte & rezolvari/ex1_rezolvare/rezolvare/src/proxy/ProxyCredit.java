package proxy;

import clase.Client;

public class ProxyCredit implements ICredit {

	private Credit credit;

	public ProxyCredit() {
		this.credit = new Credit();
	}

	@Override
	public void acordaCredit(Client client) {
		credit.acordaCredit(client);
		if (client.getVarsta() >= 21 || client.getVarsta() <= 60) {
			if (client.getSalariu() >= 2500) {
				System.out.println("Credit acordat!");
			} else
				System.out.println("Cerere respinsa!");
		} else
			System.out.println("Cerere respinsa!");
	}

}
