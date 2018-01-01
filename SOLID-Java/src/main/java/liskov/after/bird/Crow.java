package liskov.after.bird;

public class Crow implements FlyingBird{

	@Override
	public void fly() {
		System.out.println("fly");
	}

	@Override
	public void eat() {
		System.out.println("eat");
	}

}
