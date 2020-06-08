package s07.grupa1072.tudorache.andreea.dp1.composite;

public class Program {

	public static void main(String[] args) {
		
		try {
			Optiune dir1 = new Director("director1");
			Optiune dir2 = new Director("director2");
			Optiune dir3 = new Director("director3");
			
			Optiune doc1 = new Document ("document1");
			Optiune doc2 = new Document ("document2");
			Optiune doc3 = new Document ("document3");
			Optiune doc4 = new Document ("document4");
			Optiune doc5 = new Document ("document5");
			Optiune doc6 = new Document ("document6");
			
			dir2.adaugaNod(doc1);
			dir2.adaugaNod(doc2);
			dir2.adaugaNod(doc3);
			
			dir3.adaugaNod(doc4);
			dir3.adaugaNod(doc5);
			dir3.adaugaNod(doc6);
			
			dir1.adaugaNod(dir2);
			dir1.adaugaNod(dir3);
			
			dir1.descriere();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
