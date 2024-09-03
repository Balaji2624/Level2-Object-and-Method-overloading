//Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading
//   Explanation:
//This is a Java Program to Find Arithmetic Sum of 2 or 3 or 4 Variables by Passing Arguments using Method
//Overloading. Two or more methods within the same class that share the same name but with different parameter
//declarations are called overloaded methods, and the process is referred to as method overloading.
//Here we define a class with three different methods with the same name but different number of parameters.
//Now these methods can be called depending upon the number of arguments passed. Hence we get three different values as output.

package ObjectAndMethod;

public class ArithmeticSum {
      public int sum(int a,int b)
      {
    	  return a+b;
      }
      public int sum(int a, int b, int c)
      {
    	  return a+b+c;
      }
      public int sum(int a,int b,int c,int d)
      {
    	  return a+b+c+d;
      }
      public static void main(String args[])
      {
    	  ArithmeticSum obj=new ArithmeticSum();
    	  int sum1=obj.sum(10, 12);
    	  System.out.println("Sum of the two number : "+sum1);
    	  int sum2=obj.sum(10, 20, 30);
    	  System.out.println("sum of the three numbers : "+sum2);
    	  int sum3=obj.sum(10, 20, 30, 40);
    	  System.out.println("sum of the four numbers : "+sum3);
      }
}
