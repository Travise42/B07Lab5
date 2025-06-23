package lab5;

public class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double diameter() {
        return 2 * radius;
    }

    public boolean intersectsCircle(Circle circle) {
        return center.distance(circle.center) <= this.radius + circle.radius;
    }
}
