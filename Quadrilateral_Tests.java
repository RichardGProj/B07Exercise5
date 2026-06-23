import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Quadrilateral_Tests {
    @Test
    void testPerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(1, 0);

        Quadrilateral q = new Quadrilateral(p1, p2, p3 ,p4);

        assertEquals(4, q.perimeter());
    }

    @Test
    void testIsRhombus() {
        Point p1 = new Point(0, 2);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, -2);
        Point p4 = new Point(-3, 0);

        Quadrilateral q = new Quadrilateral(p1, p2, p3 ,p4);

        assertTrue(q.isRhombus());
    }

    @Test
    void testIsNotRhombus() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(-67, 50);

        Quadrilateral q = new Quadrilateral(p1, p2, p3 ,p4);

        assertFalse(q.isRhombus());
    }
}
