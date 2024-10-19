package rectangleaplication;


import java.util.Locale;
import java.util.Scanner;

import geometrica.Rectangle;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter Rectangle Width and Heigh: ");
		rectangle.w = sc.nextDouble();
		rectangle.h = sc.nextDouble();
		
		double area1 = rectangle.area();
		double perimeter1 = rectangle.perimeter();
		double diagonal1 = rectangle.diagonal();
		
		System.out.printf("Area: %.2f", area1);
		System.out.println();
		System.out.printf("Perimeter: %.2f", perimeter1);
		System.out.println();
		System.out.printf("Diagonal: %.2f", diagonal1);
		

	}

}
