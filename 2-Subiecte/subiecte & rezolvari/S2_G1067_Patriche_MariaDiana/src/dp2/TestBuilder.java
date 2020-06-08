package dp2;

public class TestBuilder {

	public static void main(String[] args) {
		
		BarieraInteligenta bariera = 
				new BarieraInteligenta.BarieraInteligentaBuilder(20,"Sun Plaza",true)
				.permiteControlDistanta()
				.build();
		System.out.println(bariera.toString());
	}

}
