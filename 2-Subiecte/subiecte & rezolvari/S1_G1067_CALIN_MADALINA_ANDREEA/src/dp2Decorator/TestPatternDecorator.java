package dp2Decorator;

public class TestPatternDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarieraAutomata bariera1=new BarieraAutomata(2, "galben", "Str. Mizil");
		BarieraAutomata bariera2=new BarieraAutomata(5, "rosu", "Str. Independentei");
		BarieraCuSenzorMiscare barieraDecorata=new BarieraCuSenzorMiscare(bariera1,TipDirectie.DREAPTA);
		barieraDecorata.deschideBariera();
		bariera2.deschideBariera();

	}

}
