package clase;

import java.util.HashMap;

public class FabricaDeClienti {
	private static HashMap<Integer, IClient> clienti = new HashMap<Integer, IClient>();

	public FabricaDeClienti() {
		super();
	}

	public static int getNumarClienti() {
		return clienti.size();
	}

	public static IClient getClient(int nrAsigurare, String nume) {
		IClient client = clienti.get(nrAsigurare);
		if (client == null) {
			client = new Client(nrAsigurare, nume);
			clienti.put(nrAsigurare, client);
		}
		return client;
	}

}
