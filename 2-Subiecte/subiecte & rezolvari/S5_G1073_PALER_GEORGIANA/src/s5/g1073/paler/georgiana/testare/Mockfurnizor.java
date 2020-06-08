package s5.g1073.paler.georgiana.testare;

public class Mockfurnizor implements IFurnizor{

	@Override
	public boolean verificaStocFurnizor(int cantitate) {
		if(cantitate > 0) {
			return true;
		}
		return false;
	}

}
