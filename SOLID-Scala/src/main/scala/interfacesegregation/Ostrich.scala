package liskov.after

class Ostrich extends Bird {

	@Override
	def eat: Unit = {
		println("eat");
	}
	
}