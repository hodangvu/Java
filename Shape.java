package OOP_Abstract;

public abstract class Shape {
	protected String color;
	protected boolean filled;
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
}	
