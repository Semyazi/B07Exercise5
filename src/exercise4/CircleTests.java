package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testPerimeter() {
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		assertEquals(c.perimeter(), 6*Math.PI);
	}

	@Test
	void testArea(){
		Point p = new Point(1,1);
		Circle c = new Circle(p, 3);
		assertEquals(c.perimeter(), 9*Math.PI);
	}

	@Test
	void testEqualTrue(){
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1, 3);
		Point p2 = new Point(1,1);
		Circle c2 = new Circle(p2, 3);
		assertEquals(c1.equals(c2), true);


	}

	@Test 
	void testEqualFalse(){
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1, 3);
		Point p2 = new Point(1,1);
		Circle c2 = new Circle(p2, 4);
		assertEquals(c1.equals(c2), false);
	}

	@Test
	void testHash(){
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(p1, 3);
		assertEquals(c1.hashCode(),24);
	}

	@Test
	void testIsInsideTrue(){
		Point centre = new Point(1,1);
		Circle c1 = new Circle(centre, 3);
		Point p1 = new Point (1,2);
		assertEquals(c1.isInCircle(p1),true);
	}

	@Test
	void testIsInsideFalse(){
		Point centre = new Point(1,1);
		Circle c1 = new Circle(centre, 3);
		Point p1 = new Point (4,3);
		assertEquals(c1.isInCircle(p1),false);
	}

}
