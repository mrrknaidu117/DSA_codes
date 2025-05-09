abstract class shape {
 abstract double area();
 void display() {
 System.out.println("this is a shape");
 }
}
class circle extends shape {
 double radius;
 circle (double radius) {
 this.radius=radius;
 }
 double area() {
 return Math.PI * radius *radius;
 }
}
class rectangle extends shape {
 double length;
 double width;
 rectangle(double length,double width) {
 this.length=length;
 this.width=width;
 }
 double area() {
 return length*width;
 }
}
public class main {
 public static void main(String [] args) {
 circle circles=new circle(5);
 rectangle rectangles=new rectangle(4,5);
 circles.display();
 System.out.println("area of circle:" +circles.area());
 rectangles.display();
 System.out.println("area of rectangle:"+rectangles.area());
 }
 }
