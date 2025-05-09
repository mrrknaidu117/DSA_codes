import java.util.scanner;

class Area{

private double length;
private double breadth;

public Area(double length,double breadth)
{
	this.length = length;
	this.breadth = breadth;
}
public double ReturnArea()
{
	return length*breadth;
}
}

public class AreaOfRectangle{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of length");
		double length = sc.nextDouble();
		System.out.println("enter value of breadth");
		double breadth = sc.nextDouble();
		
		Area rectangle = new Area(length,breadth);
		double area = rectangle.returnArea();
		System.out.println("area of rectangle : "+area);
		
		scanner.close();
	}
}