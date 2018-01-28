package openclose.shapes.after

import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite

class AreaCalculatorTest extends FunSuite with BeforeAndAfter {

  private val aeaCalculator = new AreaCalculator()

  test("Area Circle") {
    val area = aeaCalculator.getArea(Circle(2.0))
    assert(12.566370614359172 == area)
  }
  
  test("Area Rectangle") {
    val area = aeaCalculator.getArea(Rectangle(2.0, 4.0))
    assert(8.0 == area)
  }

}