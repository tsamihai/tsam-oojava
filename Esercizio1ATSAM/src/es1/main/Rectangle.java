package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Rectangle extends Shape  {
	private double Width;
	private double base;
	private double Height;
	
	
	public double getWidth() {
		return Width;
	}
	public void setWidth(double width) {
		this.Width = width;
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
	public void setHeight(double height) {
		this.Height = height;
	}
	@Override
	public double area(){
		return (Width*Height);
	}
	@Override
	public double perimeter(){
		return ((Width+Height)*2);
	}
	
}
