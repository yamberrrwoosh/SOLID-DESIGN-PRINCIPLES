package liskov

class Ostrich extends Bird {

  def fly: Unit = {
    throw new UnsupportedOperationException("Can't fly");
  }

  @Override
  def eat: Unit = {
    println("eat");
  }

}