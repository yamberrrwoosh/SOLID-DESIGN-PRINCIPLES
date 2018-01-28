package openclose.shapes.before

class AreaCalculator {
  
  def getArea(shape: Object): Double = {
		shape match {
		  case c: Circle => c.radius * c.radius * Math.PI
		  case r: Rectangle => r.width * r.height
		}
	}
  
}