package exceptii;

public class CnpWrongFormatException extends IllegalArgumentException{
	public String mesaj;
	public CnpWrongFormatException(String mesaj) {
			this.mesaj = mesaj;
	}
}
