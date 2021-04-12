package lineComparison;

public class Line {
	Point p1;
	Point p2;
	Double length;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	double getLength() {
		double length;
		length = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
		this.length = length;
		return length;
	}

	@Override
	public boolean equals(Object length2) {
		if (this == length2)
			return true;
		if (length2 == null)
			return false;
		if (getClass() != length2.getClass())
			return false;

		Line other = (Line) length2;
		if (other.length == null)
			return false;
		if (this.length == null)
			return false;
		if (!this.length.equals(other.length))
			return false;
		return true;
	}
	
	public int compare (Line line) {
		return this.length.compareTo(line.length);
	}
}