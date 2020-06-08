package s07.grupa1072.tudorache.andreea.dp1.composite;

public interface Optiune {

	void stergeNod (Optiune optiune) throws Exception;
	void adaugaNod (Optiune optiune) throws Exception;
	
	Optiune getNod(int index) throws Exception;
	
	void descriere();
}