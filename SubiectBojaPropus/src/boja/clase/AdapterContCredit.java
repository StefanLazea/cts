package boja.clase;

import boja.frameworkNou.BankAccount;

public class AdapterContCredit implements BankAccount {
	private ContCredit cont;

	public AdapterContCredit(ContCredit cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.cont.transfer((ContBancar) account, amount);
	}

	@Override
	public String toString() {
		return "AdapterContCredit [cont=" + cont.toString() + "]";
	}

}
