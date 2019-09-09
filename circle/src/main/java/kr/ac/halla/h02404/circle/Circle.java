package kr.ac.halla.h02404.circle;

public class Circle {
	//테이터 추상화
	private double x;
	private double y;
	private double radius;
	
	//생성자
	public Circle() {
		System.out.println("Created!");
	}
	public Circle(double x,double y,double radius) {
		System.out.println("Created!");
		this.radius=radius;
		this.x=x;
		this.y=y;
	}
	
	//프로시저 추상화
	
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	double getArea() {
		return 3.14*this.radius*this.radius;
	}
}
