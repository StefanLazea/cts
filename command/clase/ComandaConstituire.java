package command.clase;

public class ComandaConstituire implements ICommand {
	private ContBancar cont;

	public ComandaConstituire(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void execute() {
		this.cont.constituire();
	}

	@Override
	public void unexecute() {
		this.cont.anulareConstituire();
	}

}
