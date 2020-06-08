package dp1Template;

public abstract class TemplateBariera implements IBariera{

	@Override
	public void avertizareSonora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aprindeLuminaIntermitenta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deschideBariera() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void inchideBariera() {
		// TODO Auto-generated method stub
		
	}

	public final void aplicaPasi() {
		avertizareSonora();
		aprindeLuminaIntermitenta();
		deschideBariera();
	}

	
	
}
