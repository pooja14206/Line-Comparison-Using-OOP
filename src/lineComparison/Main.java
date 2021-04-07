package lineComparison;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(1,4);
		Point p2 = new Point(2,3);

		Line l1 = new Line(p1,p2);
		System.out.println(l1.getLength());
		
	}
}
