package exercise4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void testCreateRectangle() {
        Point tl = new Point(0, 20);
        Point tr = new Point(10, 20);
        Point bl = new Point(0, 0);
        Point br = new Point(10, 0);

        Rectangle rect = new Rectangle(tl, tr, bl, br);

        assertEquals(tl, rect.TL, "Top-left point layout mismatch");
        assertEquals(tr, rect.TR, "Top-right point layout mismatch");
        assertEquals(bl, rect.BL, "Bottom-left point layout mismatch");
        assertEquals(br, rect.BR, "Bottom-right point layout mismatch");
    }

    @Test
    void testPerimeter() {
        Point tl = new Point(0, 20);
        Point tr = new Point(10, 20);
        Point bl = new Point(0, 0);
        Point br = new Point(10, 0);

        Rectangle rect = new Rectangle(tl, tr, bl, br);

        assertEquals(60.0, rect.perimeter(), 0.0001);
    }

    @Test
    void testArea1() {
        Point tl = new Point(0, 0.5);
        Point tr = new Point(0.5, 0.5);
        Point bl = new Point(0, 0);
        Point br = new Point(0.5, 0);

        Rectangle rect = new Rectangle(tl, tr, bl, br);

        assertEquals(0.25, rect.area(), 0.0001);
    }

    @Test
    void testArea2() {
        Point tl = new Point(0, 20);
        Point tr = new Point(10, 20);
        Point bl = new Point(0, 0);
        Point br = new Point(10, 0);

        Rectangle rect = new Rectangle(tl, tr, bl, br);

        assertEquals(200.0, rect.area(), 0.0001);
    }

    @Test
    void testIsSquareTrue() {
        Point tl = new Point(0, 0.5);
        Point tr = new Point(0.5, 0.5);
        Point bl = new Point(0, 0);
        Point br = new Point(0.5, 0);

        Rectangle rect = new Rectangle(tl, tr, bl, br);

        assertTrue(rect.isSquare());
    }

    @Test
    void testIsSquareFalse() {
        Point tl = new Point(0, 20);
        Point tr = new Point(10, 20);
        Point bl = new Point(0, 0);
        Point br = new Point(10, 0);

        Rectangle rect = new Rectangle(tl, tr, bl, br);

        assertFalse(rect.isSquare());
    }
}