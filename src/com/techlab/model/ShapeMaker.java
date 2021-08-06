package com.techlab.model;

//This is a facade class which uses concrete class to delegate user calls to these classes.
public class ShapeMaker {
	private IShape circle;
	private IShape triangle;
	private IShape rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		triangle = new Traingle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
}
