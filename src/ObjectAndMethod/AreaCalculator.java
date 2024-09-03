//Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
//   Explanation:
//Enter length and breadth of the rectangle as input. After that we create an object of that class and pass the
//reference variable to two different methods. Now we calculate the area for two different objects and return them
//		to the main method. Hence we get two different areas as output.

package ObjectAndMethod;

class Rectangle
{
	double length;
	double breadth;
	
	public Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double AreaRectangle()
	{
		return length*breadth;
	}
}
class Triangle
{
	double base;
	double height;
	
	public Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	public double AreaTriangle()
	{
		return 0.5*base*height;
	}
}
public class AreaCalculator {
       public static double claculateReactangleArea(Rectangle rectangle)
       {
    	   return rectangle.AreaRectangle();
       }
       public static double calculateTriangleArea(Triangle triangle)
       {
    	   return triangle.AreaTriangle();
       }
       public static void main(String args[])
       {
    	   Rectangle rec=new Rectangle(4.0,5.0);
    	   Triangle tri=new Triangle(5.0,4.0);
    	   double rectArea=claculateReactangleArea(rec);
    	   double triArea=calculateTriangleArea(tri);
    	   System.out.println("Area of Rectangle is : "+rectArea);
    	   System.out.println("Area of Triangle is : "+triArea);
       }
}
