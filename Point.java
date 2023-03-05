package OOP;

public class Point extends java.lang.Object{
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public Point() {
		x = 0; y = 0;
	}
	//hàm khởi tạo có tham số
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//hàm khởi tạo sao chép
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public double Distance() {
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return d;
	}
	public double Distance(Point q) {
		double d = Math.sqrt(Math.pow(x - q.x,2) + Math.pow(y - q.y,2));
		return d;
	}
	public static double Distance(Point p, Point q) {
		double d = Math.sqrt(Math.pow(p.x - q.x,2) + Math.pow(p.y - q.y,2));
		return d;
	}
	
	@override
	public String toString() {
		return String.format("", "")
	}
}
