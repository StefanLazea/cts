package singleton;

public class Program {

	public static void main(String[] args) {
		GeneratorLocuinte generator = GeneratorLocuinte.getInstance();
		System.out.println(generator.getLocuinta(100, 3, 2500));
		generator = GeneratorLocuinte.getInstance();
		System.out.println(generator.getLocuinta(200, 4, 3500));
	}

}
