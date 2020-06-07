package proxy.program;

import proxy.clase.Persoana;
import proxy.clase.ProxyBilet;
import proxy.clase.VanzareBilet;

public class Program {
	public static void main(String[] args) {
		VanzareBilet vanzare = new VanzareBilet(new Persoana("Ionel", 14));
		vanzare.vanzareBilet();

		ProxyBilet vanzareProxy = new ProxyBilet(vanzare);
		vanzareProxy.vanzareBilet();

		ProxyBilet vanzare3 = new ProxyBilet(new Persoana("Alex", 25));
		vanzare3.vanzareBilet();
	}
}
