package liskov.after

class Crow extends FlyingBird {

  @Override
	def fly: Unit = {
		println("fly");
	}

	@Override
	def eat: Unit = {
		println("eat");
	}

}