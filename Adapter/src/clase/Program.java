package clase;

import clase.framework_achizitionat.CreditLeasing;

public class Program {
	public static void descrieCredit(ICredit credit) {
		credit.oferaCredit();
		System.out.println("rata lunara " + credit.rataLunara());
	}

	public static void main(String[] args) {
		CreditNevoi creditPersonal = new CreditNevoi(12, 2000);
		descrieCredit(creditPersonal);

		CreditLeasing creditLeasing = new CreditLeasing(1200, 6);
//		descrieCredit(creditLeasing);

		ICredit creditAdapter = new AdapterCredit(creditLeasing);
		descrieCredit(creditAdapter);
		
		//sau pus AdapterCreditClase
		ICredit creditAdapterClase = new AdapterCreditClase(2100, 5);
		descrieCredit(creditAdapterClase);
	}

}
