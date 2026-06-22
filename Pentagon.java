public class Pentagon {
    Point A;
    Point B;
    Point C;
    Point D;
    Point E;

    public Pentagon(Point A, Point B, Point C, Point D, Point E) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
    }

    public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A);
	}

    public boolean isRegular(){
        return (A.distance(B) == B.distance(C) && B.distance(C) == C.distance(D) && C.distance(D) == D.distance(E) && D.distance(E) == E.distance(A));
    }
}
