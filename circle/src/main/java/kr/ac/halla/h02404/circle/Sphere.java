package kr.ac.halla.h02404.circle;

public class Sphere extends Circle {
	private double z;
	public Sphere(double x, double y, double radius) {
		super(x,y,radius);
	}
	public Sphere(double x,double y,double z,double radius) {
		super(x,y,radius);
		this.z=z;
	}
	public double getVolume() {
		return 4/3.0*getRadius()*getRadius()*getRadius();
	}
}
