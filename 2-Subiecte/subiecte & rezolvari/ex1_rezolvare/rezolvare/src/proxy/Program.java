package proxy;

import clase.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Popescu", 16, 0);
		Client c2 = new Client("Ionescu", 30, 1950);
		Client c3 = new Client("Florescu", 50, 3500);

		ProxyCredit credit = new ProxyCredit();
		credit.acordaCredit(c1);
		credit.acordaCredit(c2);
		credit.acordaCredit(c3);
	}

}
