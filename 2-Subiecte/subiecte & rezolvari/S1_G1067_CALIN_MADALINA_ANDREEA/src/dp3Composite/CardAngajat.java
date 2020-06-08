package dp3Composite;

public class CardAngajat extends StructuraAbstracta{

	public boolean esteDirector;
	public String nume;
	public int nivelAcces;
	
	
	public CardAngajat(boolean esteDirector, String nume, int nivelAcces) {
		super();
		this.esteDirector = esteDirector;
		this.nume = nume;
		this.nivelAcces = nivelAcces;
	}

	@Override
	public void solicitaPermisiune() {
		// TODO Auto-generated method stub
		if(esteDirector==true) {
			System.out.println("Director solicita permisiune acces");
		}
		else {			
			System.out.println("Angajat solicita permisiune acces ");
		}
				
	}

	@Override
	public void logAccesCladire() {
		// TODO Auto-generated method stub
		if(nivelAcces==1) {
			System.out.println("Acces la orice ora");
		}
		else
			if(nivelAcces==2) {
			System.out.println("Acces doar ziua");
		    }
			else			
				System.out.println("Nu are acces");
			
		
	}

	@Override
	public void getNumeAngajat() {
		// TODO Auto-generated method stub
		System.out.println("Nume: "+this.nume);
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		if(esteDirector==true) {
			System.out.println("\tDirector: "+this.nume);
			
			this.logAccesCladire();
		}
		else {
			
			System.out.println("\t\t Angajat "+this.nume);
		
			this.logAccesCladire();
		}
		
	}

	@Override
	public void adaugaElement(StructuraAbstracta element) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void eliminaElement(StructuraAbstracta element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
	}

	@Override
	public StructuraAbstracta getElement(int index) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
