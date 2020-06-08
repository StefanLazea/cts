package s07.grupa1072.tudorache.andreea.unittests.teste.right;

import static org.junit.Assert.*;

import org.junit.Test;

import s07.grupa1072.tudorache.andreea.unittests.clase.Document;
import s07.grupa1072.tudorache.andreea.unittests.clase.DocumentException;

public class Teste1 {
	//@Category(TesteIncluse.class)
	@Test
	public void testConstructorRight() {
		try
		{
			Document documentRight = new Document("ex1", "poc", "text text", 50);
			assertEquals("ex1", documentRight.getDenumire());
			assertEquals(50, documentRight.getDimensiune(), 0.01);
		}catch (DocumentException e)
		{
			e.printStackTrace();
		}
	}
	
	//@Category(TesteIncluse.class)
	@Test(expected = DocumentException.class)
	public void textException() throws DocumentException
	{
		Document documentExc = new Document("ex1", "pom", "text text", 50);
	}

	
}