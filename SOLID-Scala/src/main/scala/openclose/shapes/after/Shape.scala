package openclose.shapes.after

trait Shape {
  def getArea: Double
}

case class Circle(radius: Double) extends Shape {
  def getArea: Double = {
    radius * radius * Math.PI
  }
}

case class Rectangle(height: Double, width: Double) extends Shape {
  def getArea: Double = {
    width * height
  }
}