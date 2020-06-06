package clase;

public class SimpleFactory {
	public ISupa creareSupa(TipSupa tipsupa) {
		switch (tipsupa) {
		case SupaLegume:
			return new SupaLegume();
		case SupaCiuperci:
			return new SupaCiuperci();
		case SupaVita:
			return new SupaVita();
		default:
			return null;
		}
	}

}
