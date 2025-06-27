package lab5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void testCircumference() {
        Point p1 = new Point(0.0, 0.5);
        Circle c1 = new Circle(p1, 4.5);
        assertEquals(c1.circumference(), 9.0 * Math.PI);
    }

    @Test
    void testCircumferenceZero() {
        Point p1 = new Point(0.0, 0.0);
        Circle c1 = new Circle(p1, 0.0);
        assertEquals(c1.circumference(), 0.0);
    }

    @Test
    void testCircumferenceNegRadius() {
        Point p1 = new Point(0.0, 0.5);
        Circle c1 = new Circle(p1, -4.5);
        assertEquals(c1.circumference(), 9.0 * Math.PI);
    }
    
    @Test
    void testArea() {
        Point p1 = new Point(-5.5, 1.0);
        Circle c1 = new Circle(p1, 5.4);
        assertEquals(c1.area(), 29.16 * Math.PI);
    }

    @Test
    void testAreaZero() {
        Point p1 = new Point(0.0, 0.0);
        Circle c1 = new Circle(p1, 0.0);
        assertEquals(c1.area(), 0);
    }
    
    @Test
    void testAreaNegRadius() {
        Point p1 = new Point(-5.5, 1.0);
        Circle c1 = new Circle(p1, -5.4);
        assertEquals(c1.area(), 29.16 * Math.PI);
    }

    @Test
    void testDiameter() {
        Point p1 = new Point(0.0, 0.5);
        Circle c1 = new Circle(p1, 4.5);
        assertEquals(c1.diameter(), 9.0);
    }

    @Test
    void testDiameterZero() {
        Point p1 = new Point(0.0, -0.0);
        Circle c1 = new Circle(p1, 0.0);
        assertEquals(c1.diameter(), 0.0);
    }
    
    @Test
    void testDiameterNegRadius() {
        Point p1 = new Point(0.0, 0.5);
        Circle c1 = new Circle(p1, -4.5);
        assertEquals(c1.diameter(), 9.0);
    }

    @Test
    void testIntersectsCircleSameZero() {
        Point p1 = new Point(0.0, -0.0);
        Circle c1 = new Circle(p1, 0.0);
        assertTrue(c1.intersectsCircle(c1));
    }

    @Test
    void testIntersectsCircleApartZero() {
        Point p1 = new Point(0.0, 1.0);
        Circle c1 = new Circle(p1, 0.0);
        Point p2 = new Point(0.0, 0.0);
        Circle c2 = new Circle(p2, 0.0);
        assertFalse(c1.intersectsCircle(c2));
    }

    @Test
    void testIntersectsCircleSame() {
        Point p1 = new Point(1.0, -0.5);
        Circle c1 = new Circle(p1, 0.6);
        assertTrue(c1.intersectsCircle(c1));
    }

    @Test
    void testIntersectsCircleInside() {
        Point p1 = new Point(1.0, -0.5);
        Circle c1 = new Circle(p1, 0.6);
        Circle c2 = new Circle(p1, 1.0);
        assertTrue(c1.intersectsCircle(c2));
    }

    @Test
    void testIntersectsCircleOutside() {
        Point p1 = new Point(1.0, -0.5);
        Circle c1 = new Circle(p1, 0.6);
        Circle c2 = new Circle(p1, 1.0);
        assertTrue(c2.intersectsCircle(c1));
    }

    @Test
    void testIntersectsCircleSide() {
        Point p1 = new Point(1.0, -0.5);
        Circle c1 = new Circle(p1, 10.6);
        Point p2 = new Point(-1.0, -0.5);
        Circle c2 = new Circle(p1, 10.0);
        assertTrue(c2.intersectsCircle(c1));
    }
    
    @Test
    void testIntersectsCircleNegRadius() {
        Point p1 = new Point(1.0, -0.5);
        Circle c1 = new Circle(p1, 10.6);
        Point p2 = new Point(-1.0, -0.5);
        Circle c2 = new Circle(p1, -10.0);
        assertTrue(c2.intersectsCircle(c1));
    }
    
}
