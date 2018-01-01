package liskov.before.bird;

public class Ostrich implements Bird{

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Can't fly");
	}

	@Override
	public void eat() {
		System.out.println("eat");
	}

}
