package command.clase;

public class ComandaOcupare implements ICommand {
	
	private Masa masa; 
		
	public ComandaOcupare(Masa masa) {
		super();
		this.masa = masa;
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		this.masa.ocupare();
	}

}
