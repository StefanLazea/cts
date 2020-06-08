package dp3Composite;

public abstract class StructuraAbstracta implements ICardAngajat{

	public abstract void getInfo();
	
	public abstract void adaugaElement(StructuraAbstracta element);
	public abstract void eliminaElement(StructuraAbstracta element);
	public abstract StructuraAbstracta getElement(int index);
}
