package openclose.shapes.before;

public class AreaCalculator
{
	public double getArea(Object shape)
	{
		double area = 0.0;
		if (shape instanceof Circle)
		{
			Circle circle = (Circle) shape;
			area = circle.getRadius() * circle.getRadius() * Math.PI;
		} else if (shape instanceof Rectangle)
		{
			Rectangle rectangle = (Rectangle) shape;
			area = rectangle.getWidth() * rectangle.getHeight();
		}
		return area;
	}
}
