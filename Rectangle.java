package OOP;

public class Rectangle {
	float length;
	float width;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimter() {
		return (length + width)*2;
	}
	@Override
	public String toString() {
		return String.format("Rectangle [length=%f,width=%f]" , length , width);
	}
	
}
