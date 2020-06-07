package b.prototype;

public class Client implements IClienti {
	private String name;
	private int age;

	public Client(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Client() {
		super();
		this.name = "n/a";
		this.age = 10;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public IClienti copiaza() {
		Client c = new Client();
		c.name = this.name;
		c.age = this.age;
		return c;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + "]";
	}

}
