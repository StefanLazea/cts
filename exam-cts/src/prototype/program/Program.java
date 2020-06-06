package prototype.program;

import prototype.clase.IListaClienti;
import prototype.clase.ListaClienti;

public class Program {

	public static void main(String[] args) {
		IListaClienti listaClienti = new ListaClienti();
		listaClienti.incarcaListaClienti();
		
		System.out.println(listaClienti);
		IListaClienti listaCopie = null;
		listaCopie = listaClienti.copiazaListaClienti();
		
		System.out.println(listaCopie.toString());
	}

}
