package s3.g1079.paris.iannis.proxy;

public class testProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car vechicle = new Car(200, "DACIA");
		Car vechicle1 = new Car(1000, "BMW");
		Car vechicle2 = new Car(300, "TESLA");

		Proxy proxy = new Proxy();
		proxy.scheduleAnInspection(vechicle);
		proxy.scheduleAnInspection(vechicle1);
		proxy.scheduleAnInspection(vechicle2);

	}

}
