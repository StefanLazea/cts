package command.clase;

public class ComandaRetragere implements ICommand {
	private ContBancar cont;

	public ComandaRetragere(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void execute() {
		this.cont.retragere();
	}

	@Override
	public void unexecute() {
		this.cont.anulareRetragere();
	}

}
