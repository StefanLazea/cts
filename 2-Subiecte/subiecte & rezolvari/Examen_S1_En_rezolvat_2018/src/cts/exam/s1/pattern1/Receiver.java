package cts.exam.s1.pattern1;

public class Receiver {
	private String nume;
	
	public Receiver(String nume) {
		super();
		this.nume = nume;
	}

	public void platitVisa() {
		System.out.println("Platit visa");
	}

	public void platitPayPal() {
		System.out.println("Platit paypal");
	}

	public void platitMasterCard() {
		System.out.println("Platit mastercard");
	}
}
