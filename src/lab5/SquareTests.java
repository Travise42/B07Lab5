package lab5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTests {
	
	// TESTS FOR Square.java
	
	
	// TEST #1: Regular valid square with in-order points
	@Test
	void testRegularSquareInOrder() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 3);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(3, 0);
		Square s = new Square(p1, p2, p3, p4);
		assertTrue(s.isSquare());
	}
	
	// TEST #2: Regular valid square with NOT in-order points
	@Test
	void testRegularSquareNoOrder() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 3);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(3, 0);
		Square s = new Square(p3, p2, p4, p1);
		assertTrue(s.isSquare());
	}
	
	// TEST #3: Square with all 4 points same
	@Test
	void testSquareSamePoints() {
		Point p = new Point(2, 2);
		Square s = new Square(p, p, p, p);
		assertFalse(s.isSquare());
	}
	
	// TEST #4: Square with points that do not form square
	@Test
	void testSquareInvalidPoints() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(2, 5);
		Point p4 = new Point(5, 4);
		Square s = new Square(p1, p2, p3, p4);
		assertFalse(s.isSquare());
	}
	
	// TEST #5: Square with valid points, but lots of decimals
	@Test
	void testWithDecimalPoints() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 3.1246371846719824621478);
		Point p3 = new Point(3.1246371846719824621478, 3.1246371846719824621478);
		Point p4 = new Point(3.1246371846719824621478, 0);
		Square s = new Square(p1, p2, p3, p4);
		assertTrue(s.isSquare());
	}
	
	// TEST #6: Test that the area is correct
	@Test
	void testSquareArea1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 3);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(3, 0);
		Square s = new Square(p3, p2, p4, p1);
		assertEquals(s.area(), 9.0);
	}
	
	// TEST #7: Test area on an invalid square
	@Test
	void testAreaInvalidSquare() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(2, 5);
		Point p4 = new Point(5, 4);
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.area(), -1);
	}
	
	// TEST #8: Test that the perimeter is correct
	@Test
	void testSquarePerimeter1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 3);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(3, 0);
		Square s = new Square(p3, p2, p4, p1);
		assertEquals(s.perimeter(), 12.0);
	}
	
	// TEST #9: Test perimeter on an invalid square
	@Test
	void testPerimeterInvalidSquare() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(2, 5);
		Point p4 = new Point(5, 4);
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.perimeter(), -1);
	}
	
	// TEST #10: Test a square with shuffled order, forcing a worst-case loop
	@Test
	void testSquareWithShuffledOrder() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 0);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(0, 2);
		Square s = new Square(p3, p1, p4, p2);
		assertTrue(s.isSquare());
	}
	
	// TEST #11: Test that the perimeter is correct
	@Test
	void testSquarePerimeter2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 4);
		Point p3 = new Point(4, 4);
		Point p4 = new Point(4, 0);
		Square s = new Square(p3, p2, p1, p4);
		assertEquals(s.perimeter(), 16.0);
	}
	
	// TEST #12: Test that the perimeter is correct
	@Test
	void testSquarePerimeter3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(5, 5);
		Point p4 = new Point(5, 0);
		Square s = new Square(p2, p4, p1, p3);
		assertEquals(s.perimeter(), 20.0);
	}
	
	// TEST #13: Test that the area is correct
	@Test
	void testSquareArea2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 4);
		Point p3 = new Point(4, 4);
		Point p4 = new Point(4, 0);
		Square s = new Square(p3, p2, p1, p4);
		assertEquals(s.area(), 16.0);
	}
	
	// TEST #14: Test that the area is correct
	@Test
	void testSquareArea3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 5);
		Point p3 = new Point(5, 5);
		Point p4 = new Point(5, 0);
		Square s = new Square(p2, p4, p1, p3);
		assertEquals(s.area(), 25.0);
	}
}
