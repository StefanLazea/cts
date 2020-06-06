package prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class ListaClienti implements IListaClienti {
	private List<Client> clienti;

	public ListaClienti() {
		this.clienti = new ArrayList<Client>();
	}

	public void setClienti(List<Client> clienti) {
		this.clienti = clienti;
	}

	@Override
	public Client copiazaClient(String nume) {
		Client temp = null;
		for (Client c : this.clienti) {
			if (c.getNume() == nume) {
				temp.setNume(c.getNume());
				temp.setNumarTelefon(c.getNumarTelefon());
			}
		}
		return temp;
	}

	@Override
	public void incarcaListaClienti() {
		clienti.clear();
		clienti.add(new Client("Ionel", "0728987899"));
		clienti.add(new Client("George", "0734313449"));
		clienti.add(new Client("Mihai", "0758687177"));
	}

	@Override
	public IListaClienti copiazaListaClienti() {
		ListaClienti lista = new ListaClienti();
		List<Client> listaTemp = new ArrayList<Client>();
		for (Client c : this.clienti) {
			listaTemp.add(c);
		}
		lista.setClienti(listaTemp);

		return lista;
	}

	@Override
	public String toString() {
		return "ListaClienti [clienti=" + clienti + "]";
	}

}
