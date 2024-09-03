package ObjectAndMethod;

import java.util.Scanner;

public class ByteSumWithTypeCasting {
      public static void main(String args[])
      {
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("Enter a first number : ");
    	  byte first=scan.nextByte();
    	  System.out.println("Enter a second number : ");
    	  byte second=scan.nextByte();
    	  int a=(int)first;
    	  int b=(int)second;
    	  int sum=a+b;
    	  System.out.println("Sum of the two numbers : "+sum);
      }
}
