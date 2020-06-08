package dp2Decorator;

public class BarieraCuSenzorMiscare extends DecoratorBariera{

	public TipDirectie directie;
	
	public BarieraCuSenzorMiscare(IBariera bariera, TipDirectie tip) {
		super(bariera);
		// TODO Auto-generated constructor stub
		this.directie=tip;
	}

	@Override
	public void deschideBariera() {
		// TODO Auto-generated method stub
		
		switch(directie) {
		case FATA:
			System.out.println("Deschidere cu senzor din fata ");
			break;
		case SPATE:
			System.out.println("Deschidere  cu senzor din spate");
			break;
		case STANGA:
			System.out.println("Deschidere cu senzor din stanga");
			break;
		case DREAPTA:
			System.out.println("Deschidere cu senzor din dreapta");
			break;
		}
	}
	
	
	
}
