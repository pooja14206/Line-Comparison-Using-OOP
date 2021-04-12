package lineComparison;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(10, 15);
		Point p2 = new Point(0, -3);
		Point p3 = new Point(10, 7);
		Point p4 = new Point(9, -3);

		Line l1 = new Line(p1, p2);
		Line l2 = new Line(p3, p4);

		l1.getLength();
		l2.getLength();

		if (l1.equals(l2))
			System.out.println("Equal");
		else
			System.out.println("NotEqual");

	}

}