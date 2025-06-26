package lab5;

public class Square {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		// We do not want to allow a square object to be created with irregular points
		// So let's return -1 (an invalid area)
		if(this.isSquare()) {
			// Use point A as reference since we have already validated it is a valid square
			double AB = A.distance(B);
			double AC = A.distance(C);
			double AD = A.distance(D);
			
			if(AB == AC) { // D is our diagonal point
				return A.distance(B) + B.distance(D) + D.distance(C) + C.distance(A);
			}
			if(AB == AD) { // C is our diagonal point
				return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
			}
			if(AC == AD) { // B is our diagonal
				return A.distance(C) + C.distance(B) + B.distance(D) + D.distance(A);
			}
		}
		return -1;
	}
	
	public double area() {
		// We do not want to allow a square object to be created with irregular points
		// So let's return -1 (an invalid area)
		if(this.isSquare()) {
			// Use point A as reference since we have already validated it is a valid square
			double AB = A.distance(B);
			double AC = A.distance(C);
			double AD = A.distance(D);
			
			if(AB == AC) { // D is our diagonal point so don't use it
				return AB*AB;
			}
			if(AB == AD) { // C is our diagonal point
				return AB*AB;
			}
			if(AC == AD) { // B is our diagonal
				return AC*AC;
			}
		}
		return -1;
	}
	
	public boolean isSquare() {
		
		// The code below will pass if all 4 points are equal
		// However, that does not form a square
		// So first we must test for it
		if(A.equals(B) && B.equals(C) && C.equals(D)) return false;
		
		// Collect all 6 possible distances
		double AB = A.distance(B);
		double AC = A.distance(C);
		double AD = A.distance(D);
		double BC = B.distance(C);
		double BD = B.distance(D);
		double CD = C.distance(D);
		
		double[] distances = {AB, AC, AD, BC, BD, CD};
		
		// Sort the array from smallest to largest.
		// If this is a valid square, the four smallest lengths (sides) should be equal
		// And the 2 largest lengths (diagonals) should be equal
		// This is so that a Square can be validated regardless of the order of the points entered
		for(int i = 0; i < distances.length - 1; i++) {
			for(int j = i + 1; j < distances.length; j++) {
				if(distances[i] > distances[j]) {
					double temp = distances[i];
					distances[i] = distances[j];
					distances[j] = temp;
				}
			}
		}
		
		// We now check if the 4 sides are equal
		boolean equalSides = distances[0] == distances[1] &&
							 distances[1] == distances[2] &&
							 distances[2] == distances[3];
		
		// Similarly, check diagonals
		boolean equalDiagonals = distances[4] == distances[5];
		
		return equalSides && equalDiagonals;
	}
}
