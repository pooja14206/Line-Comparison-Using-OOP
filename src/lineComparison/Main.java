package lineComparison;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(10, 5);
		Point p2 = new Point(0, -3);
		Point p3 = new Point(10, 7);
		Point p4 = new Point(9, -13);

		Line l1 = new Line(p1, p2);
		Line l2 = new Line(p3, p4);

		l1.getLength();
		l2.getLength();

		if (l1.equals(l2))
			System.out.println("Equal");
		else if (l1.compare(l2) > 0)
			System.out.println("Frist line is greater.");
		else
			System.out.println("First line is smaller");

	}

}