package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testPerimeter() {
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		assertEquals(6*Math.PI, c.perimeter());
	}

	@Test
	void testArea(){
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		assertEquals(9*Math.PI, c.area());
	}

	@Test
	void testEqualTrue(){
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1, 3);
		Point p2 = new Point(1,1);
		Circle c2 = new Circle(p2, 3);
		assertEquals(true, c1.equals(c2));


	}

	@Test 
	void testEqualFalse(){
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1, 3);
		Point p2 = new Point(1,1);
		Circle c2 = new Circle(p2, 4);
		assertEquals(false, c1.equals(c2));
	}

	@Test
	void testHash(){
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1, 3);
		assertEquals(24, c1.hashCode());
	}

	@Test
	void testIsInsideTrue(){
		Point centre = new Point(1,1);
		Circle c1 = new Circle(centre, 3);
		Point p1 = new Point (1,2);
		assertEquals(true, c1.isInCircle(p1));
	}

	@Test
	void testIsInsideFalse(){
		Point centre = new Point(1,1);
		Circle c1 = new Circle(centre, 3);
		Point p1 = new Point (4,3);
		assertEquals(false, c1.isInCircle(p1));
	}

}
