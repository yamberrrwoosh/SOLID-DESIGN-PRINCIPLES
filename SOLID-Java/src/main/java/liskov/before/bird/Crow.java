package liskov.before.bird;

public class Crow implements Bird{

	@Override
	public void fly() {
		System.out.println("fly");
	}

	@Override
	public void eat() {
		System.out.println("eat");
	}

}
