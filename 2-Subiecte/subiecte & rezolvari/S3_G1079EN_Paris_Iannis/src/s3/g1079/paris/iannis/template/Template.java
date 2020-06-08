package s3.g1079.paris.iannis.template;

public abstract class Template {
	
	public abstract void visualCheck();
	public abstract void exhaustCheck();
	public abstract void brakeCheck();
	public abstract void partsCheck();

	final public void verificaVehicul() {
		visualCheck();
		exhaustCheck();
		brakeCheck();
		partsCheck();
	}
}
