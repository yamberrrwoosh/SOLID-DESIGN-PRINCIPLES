package liskov

class Crow extends Bird {

  @Override
	def fly: Unit = {
		println("fly");
	}

	@Override
	def eat: Unit = {
		println("eat");
	}

}