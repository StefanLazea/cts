package cts.examen.s2.pattern3;

public abstract class Template {
		// must be the 1st step
		abstract void askName();
		// must be the 3rd step
		abstract void askMedicalRecords();
		// must be the 5th step
		abstract void askEmail();
		
		// must be the 2nd step
		abstract void  askSocialNumber();
		
		// must be the 4th step
		abstract void askCreditCard();	
		
	final public void inregistreazate() {
		askName();
		askSocialNumber();
		askMedicalRecords();
		askCreditCard();
		askEmail();
	}
}
