package boja.clase;

import boja.frameworkNou.BankAccount;

public class AdapterContDebit implements BankAccount {
	private ContDebit cont;

	public AdapterContDebit(ContDebit cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.cont.transfer((ContBancar) account, amount);
	}

	@Override
	public String toString() {
		return "AdapterContDebit [cont=" + cont.toString() + "]";
	}
}
