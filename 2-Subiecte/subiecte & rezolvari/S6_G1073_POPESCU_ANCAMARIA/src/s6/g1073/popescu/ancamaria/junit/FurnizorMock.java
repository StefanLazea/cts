package s6.g1073.popescu.ancamaria.junit;

public class FurnizorMock implements IFurnizor{

	private boolean verificaStoc;
	
	public void setVerificaStoc(boolean verificaStoc) {
		this.verificaStoc = verificaStoc;
	}

	@Override
	public boolean verificaStocFurnizor(int cantitate) {
		return this.verificaStoc;
	}

}
