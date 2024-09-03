//Java Program to create a calculator and Return a Value from a Method.
//   Explanation:
//   We make a method named input which is used to get input from the user. We also make a method named add which
//   is used to perform addition and return the result back to the input method where we finally print the result.

package ObjectAndMethod;

import java.util.Scanner;

public class Calculator {
           public static void Input()
           {
        	   Scanner scan=new Scanner(System.in);
        	   System.out.println("Enter a first number : ");
        	   int a=scan.nextInt();
        	   System.out.println("Enter a second number : ");
        	   int b=scan.nextInt();
        	   int result=add(a,b);
        	   System.out.println("Final result of the addition is : "+result);
           }
           public static int add(int x,int y)
           {
        	   return x+y;
           }
           public static void main(String args[])
           {
        	   
        	   Input();
           }
}
