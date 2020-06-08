package dp3;

import java.util.ArrayList;

public class Client {
	private ArrayList<IBariera> comenzi;
	private Executant executant;
	
	
	@Override
	public String toString() {
		return "Client [comenzi=" + comenzi + ", executant=" + executant.getNumeExecutant() + "]";
	}

	public Client(Executant executant) {
		super();
		this.comenzi = new ArrayList<>();
		this.executant = executant;
	}

	public void adaugaComanda(IBariera bariera)
	{
		this.comenzi.add(bariera);
	}
	
	public void trimiteComenzi()
	{
		for(IBariera bariera : comenzi)
			bariera.deschide(executant.getNumeExecutant());
	}

}
