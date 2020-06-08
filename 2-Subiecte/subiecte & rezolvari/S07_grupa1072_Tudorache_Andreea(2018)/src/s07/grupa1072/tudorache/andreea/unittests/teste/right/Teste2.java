package s07.grupa1072.tudorache.andreea.unittests.teste.right;

import static org.junit.Assert.*;

import org.junit.Test;

import s07.grupa1072.tudorache.andreea.unittests.clase.Document;
import s07.grupa1072.tudorache.andreea.unittests.clase.DocumentException;

public class Teste2 {

	@Test
	public void testExistence()
	{
		try
		{
			Document documentExistence = new Document("doc1", "poc", "textul documentului este: ", 30);
			assertNotNull(documentExistence);
		}catch (DocumentException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBoundaryLimitaInferioara() throws DocumentException
	{
		Document test = new Document();
		test.setDimensiune(0);
		assertEquals(0, test.getDimensiune(), 0.02);
	}
	
	@Test
	public void testBoundaryLimitaSuperioara() throws DocumentException
	{
		Document test = new Document();
		test.setDimensiune(100);
		assertEquals(100, test.getDimensiune(), 0.02);
	}

}
