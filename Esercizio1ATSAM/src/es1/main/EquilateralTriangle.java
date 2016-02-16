package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class EquilateralTriangle extends Shape {
	private double Width;
	private double base;
	private double Height;
	
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		Width = width;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double d) {
		 this.Height = d;
	}
	@Override
	public double area() {
		
		return (base*Height)/2;
	}
	@Override
	public double perimeter() {
		
		return base*3;
	}
	
	
}
