package exceptii;

public class CnpWrongFirstLetterException extends IllegalArgumentException {
	public CnpWrongFirstLetterException(String mesaj) {
		super(mesaj);
	}
}
