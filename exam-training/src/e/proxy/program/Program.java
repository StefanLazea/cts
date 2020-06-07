package e.proxy.program;

import e.proxy.IVanzareBilet;
import e.proxy.ProxyBilet;
import e.proxy.VanzareBilet;

public class Program {

	public static void main(String[] args) {
		VanzareBilet bilet = new VanzareBilet(13);
		bilet.vanzare();
		IVanzareBilet vanzareProxy = new ProxyBilet(bilet);
		vanzareProxy.vanzare();
		
	}

}
