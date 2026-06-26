package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapezoidTest {

	@Test
	void testIsTrapezoidTrue(){
		Point A = new Point(0, 0);
		Point B = new Point(6, 0);
		Point C = new Point(6, 3);
		Point D = new Point(3, 3);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertTrue(t.isTrapezoid());
		
	}
	
	@Test
	void testIsTrapezoidFalseNoParallelSides() {
		Point A = new Point(0, 0);
		Point B = new Point(2, 1);
		Point C = new Point(3, 4);
		Point D = new Point(1, 3);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isTrapezoid());
		}
	
	@Test
	void testIsTrapezoidFalseParallelogram() {
		Point A = new Point(0, 0);
		Point B = new Point(2, 0);
		Point C = new Point(1, 1);
		Point D = new Point(3, 1);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertFalse(t.isTrapezoid());
	}
	
	@Test
	void testPerimeter() {
		Point A = new Point(0, 0);
		Point B = new Point(4, 0);
		Point C = new Point(3, 2);
		Point D = new Point(1, 2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		double expected = 4 + 2 +2 * Math.sqrt(5);
		
		assertEquals(expected, t.perimeter(), 0.0001);
	}
	
	@Test
	void testGetHeight1() {
		Point A = new Point(3, 4);
		Point B = new Point(5, 4);
		Point C = new Point(1, 6);
		Point D = new Point(6, 6);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertEquals(2.0, t.getHeight(), 0.0001);
				
	}
	
	@Test
	void testGetHeight2() {
		Point A = new Point(1, 1);
		Point B = new Point(1, 2);
		Point C = new Point(2, 3);
		Point D = new Point(5, 5);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertEquals(1 / Math.sqrt(2), t.getHeight(), 0.0001);
				
	}
	
	@Test
	void testGetArea() {
		Point A = new Point(0, 0);
		Point B = new Point(4, 0);
		Point C = new Point(4, 2);
		Point D = new Point(1, 2);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		
		assertEquals(7.0, t.area(), 0.0001);
	}
	
	@Test
	void testStandardize() {
		Point A = new Point(0, 0);
		Point B = new Point(2, 0);
		Point C = new Point(0, 1);
		Point D = new Point(4, 1);
		
		Trapezoid t = new Trapezoid(A, B, C, D);
		Trapezoid standardized = t.standardize();
		
		assertEquals(C, standardized.A);
		assertEquals(D, standardized.B);
		assertEquals(A, standardized.C);
		assertEquals(B, standardized.D);
	}

	

}
