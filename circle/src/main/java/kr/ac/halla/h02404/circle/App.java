package kr.ac.halla.h02404.circle;

public class App 
{
    public static void main( String[] args )
    {
        Circle cricle1=new Circle();
        cricle1.setRadius(4.0f);
        System.out.println(cricle1.getRadius());
        System.out.println(cricle1.getArea());
        Circle circle2 = new Circle(3,4,5);
        System.out.println(circle2.getArea());
        Sphere s= new Sphere(1,2,3,4);
        Circle circle=new Sphere(3,4,5,6);
        Sphere sphere=(Sphere) circle;
        System.out.println(sphere.getVolume());
        
        Circle circle3= new Circle(3,4,5);
        if(circle3 instanceof Sphere) {
        Sphere sphere2=(Sphere) circle3;
        System.out.println(sphere2.getVolume());
        }
        
       }
}
