package openclose.shapes.after;

import org.junit.Assert;
import org.junit.Test;

public class AreaCalculatorTest {

	private AreaCalculator areaCalculator = new AreaCalculator();
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCircleArea() {
		double area = areaCalculator.getArea(new Circle(2.00));
		Assert.assertEquals(12.566370614359172, area, DELTA);
		System.out.println("Circle Area: " + area);
	}
	
	@Test
	public void testRectangleArea() {
		double area = areaCalculator.getArea(new Rectangle(2, 4));
		Assert.assertEquals(8, area, DELTA);
		System.out.println("Rectangle Area: " + area);
	}
}
