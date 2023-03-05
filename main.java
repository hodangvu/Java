package OOP;

public class main {
	public static void main(String[] args) {
		OOP();
	}
	static void OOP() {
		Point p = new Point();
		System.out.println("p" + p.toString());
		Point p2 = new Point(5,10);
		System.out.println("p2" + p2.toString());
		Point p3 = new Point(p2);
		System.out.println("p3" + p3.toString());
		double p2p = p2.Distance(p);
		double pp2 = Point.Distance(p2, p2);
		System.out.printf("\n%f = %f", p2p, pp2);
	}
	static void Basic() {
		
	}
}
