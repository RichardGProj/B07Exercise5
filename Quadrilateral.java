
public class Quadrilateral {
	Point a, b, c, d;
	
	public Quadrilateral(Point a, Point b, Point c, Point d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double perimeter() {
		return a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
	}
	
	public boolean isSquare() {
		double sideLength = a.distance(b);
		if (sideLength != b.distance(c) || sideLength != c.distance(d) || sideLength != d.distance(a)) {
			return false;
		}
		
		
	}
}
