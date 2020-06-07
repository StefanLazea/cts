package command.clase;

public class ContBancar {
	private String iban;

	public ContBancar(String iban) {
		super();
		this.iban = iban;
	}

	public void retragere() {
		System.out.println("Retragere din contul " + this.iban);
	}

	public void constituire() {
		System.out.println("Contul " + this.iban + " s-a constituit");
	}

	public void depunere() {
		System.out.println("S-au depus banii in contul " + this.iban);
	}
	
	public void anulareRetragere() {
		System.out.println("S-a anulat retragerea din contul " + this.iban);
	}

	public void anulareConstituire() {
		System.out.println("Constituirea contului " + this.iban + " a fost anulata");
	}

	public void anulareDepunere() {
		System.out.println("S-a anulat depunerea la bani " + this.iban);
	}

}
