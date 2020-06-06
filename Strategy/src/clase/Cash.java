package clase;

public class Cash implements ModPlata {

	@Override
	public void plateste(String numePacient, float suma) {
		System.out.println(numePacient+" face o plata cash de " + suma);
	}

}
