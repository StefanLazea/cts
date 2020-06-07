package d.state.program;

import d.state.Bancomat;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bancomat  b = new Bancomat("atm", 3000);
		b.verificaSold();
		b.introducerePin();
		b.retragere(2300);
		
		Bancomat bb = new Bancomat("Otp", 2000);
	}
	

}
