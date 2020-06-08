package s6.g1073.popescu.ancamaria.facade;

public class ConexiuneBD {
	String conexiune;

	public ConexiuneBD(String conexiune) {
		this.conexiune = conexiune;
	};
	
	public void deschideConexiune() {
		System.out.println("Conectare baza de date");
	}
	

}
