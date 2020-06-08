package dp1Template;

public class TestPatternTemplate {

	public static void main(String[] args) {
		TemplateBariera barieraOrizontala=new BarieraDeschidereOrizontala();
		barieraOrizontala.aplicaPasi();
		TemplateBariera barieraverticala=new BarieraDeschidereVerticala();
		barieraverticala.aplicaPasi();
	}
	
	
}
