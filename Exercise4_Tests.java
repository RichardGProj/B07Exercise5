import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class Exercise4_Tests {
    @Test
    void testEquilateral1() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(Math.sqrt(5), 0);
        Point p3 = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);

        Triangle t = new Triangle(p1, p2, p3);
        int x = p1.hashCode();
        assertTrue(t.isEquilateral());
    }

    @Test
    void testEquilateral2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(1, 0);

        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p1, p3, p2);
        assertFalse(t1.isEquilateral());
        assertFalse(t2.isEquilateral());
    
    }

    @Test
    void testPerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(1, 0);

        Triangle t = new Triangle(p1, p2, p3);
        assertEquals(2 + Math.sqrt(2), t.perimeter());
    }

    @Test
    void testPointEquals1() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(-1, -1);

        assertTrue(p1.equals(p1));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals(1));

        assertFalse(p1.equals(p2));
    }

    @Test
    void testPointEquals2() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, -1);

        assertFalse(p1.equals(p2));
    }

    @Test
    void testPointEquals3() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

        assertTrue(p1.equals(p2));
    }
}
