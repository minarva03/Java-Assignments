package com.training.quest1;

public class ShapeMain {

	public static void main(String[] args) {
		IShape rectangle = (x,y) -> System.out.println("Area of the rectangle is: " + (x*y));
		rectangle.area(10,20);
		
		System.out.println();
		IShape triangle = (x,y) -> System.out.println("Area of the triangle is: " + (0.5*x*y));
		triangle.area(8,10);
		
		System.out.println();
		IShape square = (x,y) -> System.out.println("Area of the square is: " + (x*x));
		square.area(5,10);

	}

}
