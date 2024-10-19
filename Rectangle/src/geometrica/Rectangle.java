package geometrica;

public class Rectangle {
	
	public double w;
	public double h;
	
	public double area() {
		return w * h;
	}
	public double perimeter() {
		return 2*(w + h);
	}
	public double diagonal() {
		return Math.sqrt((w * w) + (h * h));
	}
}
