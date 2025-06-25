package lab5;

public class Hexagon {
	Point[] vertices = new Point[6];
	Point center;
	double sideLength;
	final private double COS60 = 0.5;
	final private double SIN60 = Math.sqrt(3.0)/2.0;
	
	/**
	 * Constructs a regular hexagon given the center and one of the vertices.
	 * The remaining vertexes are generated in a counterclockwise order
	 * @param center the center of the hexagon
	 * @param vertex1 the first vertex of the hexagon
	 */
	public Hexagon(Point center, Point vertex1) {
		this.center = center;
		this.vertices[0] = vertex1;
		this.sideLength = center.distance(vertex1);
		
		for (int i = 0; i < 5; i++) {
			this.vertices[i+1] = this.rotatePoint60Deg(this.center, this.vertices[i]);
		}
		
	}
	
	
	/**
	 * Constructs a regular hexagon given the side length where the first vertex and the center are parallel to the x-axis. 
	 * The remaining vertices are generated in a counterclockwise order
	 * @param center the center of the hexagon
	 * @param sideLength the side length of the hexagon
	 */
	public Hexagon(Point center, double sideLength) {
		this.center = center;
		this.sideLength = sideLength;
		this.vertices[0] = new Point(center.x + sideLength, center.y);
		
		for (int i = 0; i < 5; i++) {
			this.vertices[i+1] = this.rotatePoint60Deg(this.center, this.vertices[i]);
		}
	}
	
	/**
	 * Rotates a point around another point by 60 degrees counterclockwise
	 * @param axis the point representing the axis or rotation
	 * @param target the point to be rotated
	 * @return the rotated Point
	 */
	private Point rotatePoint60Deg(Point axis, Point target) {
		//translate points so that axis is at the origin
		Point result = new Point(target.x - axis.x, target.y - axis.y);
		
		//rotate around origin
		double newX = result.x * this.COS60 - result.y * this.SIN60;
		double newY = result.x * this.SIN60 + result.y * this.COS60;
		
		// translate point back to original position
		result.x = newX + axis.x;
		result.y = newY + axis.y;
		
		return result;
	}
	
	public double calculateArea() {
		return this.sideLength * this.sideLength * Math.sqrt(3.0) * 3.0/2.0;
	}
	
	public double calculatePerimeter() {
		return 6.0 * this.sideLength;
	}
	
	
	

}
