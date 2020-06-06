package composite.clase;

public interface ISectiuneAsezare {
	void adaugaOptiune(ISectiuneAsezare sectiune);
	ISectiuneAsezare getChild(int index);
	void stergereOptiune(ISectiuneAsezare sectiune);
	void descriere(String spatiu);
}
