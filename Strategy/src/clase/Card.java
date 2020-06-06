package clase;

public class Card implements ModPlata{

	@Override
	public void plateste(String numePacient, float suma) {
		System.out.println(numePacient+" face o plata cu cardul avand valoarea  " + suma);		
	}

}
