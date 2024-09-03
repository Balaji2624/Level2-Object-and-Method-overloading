package ObjectAndMethod;

public class AreaCalculatorOverloading {
         public double area(int side)
         {
        	 return side*side;
         }
         public double area(int length,int breadth)
         {
        	 return length*breadth;
         }
         public double area(int radius,boolean isCircle)
         {
        	 if(isCircle)
        	 {
        		 return 3.14*radius*radius;
        	 }
        	 return 0;
         }
         public static void main(String args[])
         {
        	 AreaCalculatorOverloading obj=new AreaCalculatorOverloading();
        	 double sq=obj.area(5);
        	 System.out.println("Area of the square : "+sq);
        	 double rec=obj.area(5, 9);
        	 System.out.println("Area of rectangle : "+rec);
        	 double circle=obj.area(2, true);
        	 System.out.println("Area of circle is : "+circle);
         }
}
