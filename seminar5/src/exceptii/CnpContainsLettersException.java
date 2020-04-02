package exceptii;

public class CnpContainsLettersException extends IllegalArgumentException{
 
	public CnpContainsLettersException(String mesaj) {
		super(mesaj);
	}
}
