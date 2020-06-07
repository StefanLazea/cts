package boja.program;

import boja.clase.AdapterContCredit;
import boja.clase.AdapterContDebit;
import boja.clase.ContBancar;
import boja.clase.ContCredit;
import boja.clase.ContDebit;
import boja.clase.SimpleFactorySingleton;

public class Program {

	public static void main(String[] args) {
		SimpleFactorySingleton instantaFactory = SimpleFactorySingleton
				.getInstance("BRD", "Ploiesti");
		ContBancar contDebit = instantaFactory.creazaContBancar("ContDebit", 300);
		System.out.println(contDebit.toString());
		contDebit.depune(10);
		System.out.println(contDebit.toString());

		ContBancar contCredit = instantaFactory.creazaContBancar("ContCredit", 200);
		System.out.println(contCredit.toString());
		
		contCredit.transfer(contDebit, 100);
		System.out.println(contDebit.toString());
		System.out.println(contCredit.toString());
		
		ContCredit contCredit2 = (ContCredit) instantaFactory.creazaContBancar("ContCredit", 200);
		ContDebit contDebit2 = (ContDebit)instantaFactory.creazaContBancar("ContDebit", 3000);
		
		AdapterContCredit cont = new AdapterContCredit(contCredit2);
		System.out.println(cont.toString());
		AdapterContDebit contAdapterDebit = new AdapterContDebit(contDebit2);
		contAdapterDebit.accountTransfer(cont, 200);
		System.out.println(cont.toString());

	}

}
	