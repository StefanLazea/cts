package command.clase;

public class ComandaDepunere implements ICommand {
	private ContBancar cont;

	public ComandaDepunere(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void execute() {
		this.cont.depunere();
	}

	@Override
	public void unexecute() {
		this.cont.anulareDepunere();
	}

}
