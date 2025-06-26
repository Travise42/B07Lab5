package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HexagonTests {
	
	@Test
	void testHexagonArea1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 0);
		Hexagon h1 = new Hexagon(p1, p2);
		assertEquals(h1.calculateArea(), (3 * Math.sqrt(3)/2) * Math.pow(2, 2));
	}

	@Test
	void testHexagonArea2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Hexagon h1 = new Hexagon(p1, p2);
		assertEquals(h1.calculateArea(), 0);
	}
	
	@Test
	void testHexagonArea3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(4, 2);
		Hexagon h1 = new Hexagon(p1, p2);
		Hexagon h2 = new Hexagon(p3, p4);
		assertEquals(h1.calculateArea(), h2.calculateArea());
	}
	
	@Test
	void testHexagonArea4() {
		Point p1 = new Point(0, 0);
		double sidelength = 5.0;
		Hexagon h1 = new Hexagon(p1, sidelength);
		assertEquals(h1.calculateArea(), (3 * Math.sqrt(3)/2) * Math.pow(5, 2));
	}
	
	@Test
	void testHexagonPerimeter1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 0);
		Hexagon h1 = new Hexagon(p1, p2);
		assertEquals(h1.calculatePerimeter(), 12);
	}
	
	@Test
	void testHexagonPerimeter2() {
		Point p1 = new Point(0, 0);
		double sidelength = 5.0;
		Hexagon h1 = new Hexagon(p1, sidelength);
		assertEquals(h1.calculatePerimeter(), 30);
	}
	
	@Test
	void testHexagonPerimeter3() {
		Point p1 = new Point(0, 0);
		double sidelength = 2.0;
		Point p3 = new Point(0, 0);
		Point p4 = new Point(0, 2);
		Hexagon h1 = new Hexagon(p1, sidelength);
		Hexagon h2 = new Hexagon(p3, p4);
		assertEquals(h1.calculatePerimeter(), h2.calculatePerimeter());
	}
	
	@Test
	void testHexagonPerimeter4() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Hexagon h1 = new Hexagon(p1, p2);
		assertEquals(h1.calculatePerimeter(), 0);
	}
}
