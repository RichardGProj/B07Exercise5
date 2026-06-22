import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Pentagon_Tests {
    @Test
    void testPerimeter() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        Point c = new Point(1, 2);
        Point d = new Point(2, 1);
        Point e = new Point(2, 0);

        Pentagon p = new Pentagon(a, b, c, d, e);
        assertEquals(4 + 2 * Math.sqrt(2), p.perimeter());
    }

    @Test
    void testNotRegular() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        Point c = new Point(1, 2);
        Point d = new Point(2, 1);
        Point e = new Point(2, 0);

        Pentagon p = new Pentagon(a, b, c, d, e);
        assertFalse(p.isRegular());
    }
}
