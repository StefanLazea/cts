package dp3Composite;

import java.util.ArrayList;

public class GrupareStructura extends StructuraAbstracta {

	private ArrayList<StructuraAbstracta> structura;
	public String numeDepartament;
	public boolean esteDepartament;
	
	
	
	public GrupareStructura(String numeDepartament,boolean esteDepartament) {
		super();
		this.numeDepartament = numeDepartament;
		this.structura=new ArrayList<>();
		this.esteDepartament=esteDepartament;
	}

	@Override
	public void solicitaPermisiune() {
		// TODO Auto-generated method stub
		for(StructuraAbstracta nod:structura) {
			nod.solicitaPermisiune();
		}
		
	}

	@Override
	public void logAccesCladire() {
		// TODO Auto-generated method stub
		for(StructuraAbstracta nod:structura) {
			nod.logAccesCladire();
		}
		
	}

	@Override
	public void getNumeAngajat() {
		// TODO Auto-generated method stub
		for(StructuraAbstracta nod:structura) {
			nod.getNumeAngajat();
		}
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		if(esteDepartament==true)
			System.out.println("\tNume: "+this.numeDepartament);
		else 
			System.out.println("Nume: "+this.numeDepartament);
		
		for(StructuraAbstracta nod:structura) {
			nod.getInfo();
		}
		
	}

	@Override
	public void adaugaElement(StructuraAbstracta element) {
		// TODO Auto-generated method stub
		structura.add(element);
		
	}

	@Override
	public void eliminaElement(StructuraAbstracta element) {
		// TODO Auto-generated method stub
		if(this.structura!=null) {
			this.structura.remove(element);
		}
		
	}

	@Override
	public StructuraAbstracta getElement(int index) {
		// TODO Auto-generated method stub
		return this.structura.get(index);
	}

}
