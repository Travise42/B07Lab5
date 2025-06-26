package lab5;

/**
 * Circle represents a circle with a given radius and position.
 * @author Alex Y
 */
public class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    /**
     * Calculates the circumference (perimeter) of the circle.
     * @return the circumference of the circle
     */
    public double circumference() {
        // A circle's circumference is given by 2πr
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the current area of the circle.
     * @return the area of the circle
     */
    public double area() {
        // A circle's area is given by πr²
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the diameter of the circle.
     * @return the diameter of the circle
     */
    public double diameter() {
        // A circle's diameter is given by 2r
        return 2 * radius;
    }

    /**
     * Calculates whether this circle is intersecting <code>circle</code>.
     * @param circle the circle to check for intersection
     * @return True if intersecting circle, False otherwise
     */
    public boolean intersectsCircle(Circle circle) {
        // Two circles intersect each other when their distance is less than or equal to their combined radius
        return center.distance(circle.center) <= this.radius + circle.radius;
    }
}
