package dp2Decorator;

public abstract class DecoratorBariera implements IBariera{

	IBariera bariera;
	

	public DecoratorBariera(IBariera bariera) {
		super();
		this.bariera = bariera;
	}

	@Override
	public void avertizareSonora() {
		// TODO Auto-generated method stub
		bariera.avertizareSonora();
		
	}

	@Override
	public void aprindeLuminaIntermitenta() {
		// TODO Auto-generated method stub
		bariera.aprindeLuminaIntermitenta();
		
	}

	@Override
	public void deschideBariera() {
		// TODO Auto-generated method stub
		bariera.deschideBariera();
		
	}

	@Override
	public void inchideBariera() {
		// TODO Auto-generated method stub
		bariera.inchideBariera();
		
	}

}
