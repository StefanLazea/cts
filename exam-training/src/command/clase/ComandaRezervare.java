package command.clase;

public class ComandaRezervare implements ICommand{

	private Masa masa;
	
	public ComandaRezervare(Masa masa) {
		super();
		this.masa = masa;
	}

	@Override
	public void executa() {
		this.masa.rezervare();		
	}

}
