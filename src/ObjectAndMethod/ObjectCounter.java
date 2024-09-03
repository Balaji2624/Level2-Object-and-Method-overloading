//Java Program to Count Number of Objects Created for Class
//   Explanation:Whenever an object is made of a class, its constructor is invoked. Whenever the constructor
//   runs we increment the counter value. Hence the number of objects created of a class equals the counter
//   value.

package ObjectAndMethod;

public class ObjectCounter {
	   static int count=0;
         public ObjectCounter()
         {
        	 count++;
         }
         public static int getCounterObject()
         {
        	 return count;
         }
         public static void main(String args[])
         {
        	 ObjectCounter obj1=new ObjectCounter();
        	 ObjectCounter obj2=new ObjectCounter();
        	 ObjectCounter obj3=new ObjectCounter();
        	 
        	 System.out.println("Count of the objects created for a class : "+getCounterObject());
         }
}
