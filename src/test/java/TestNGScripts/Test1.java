package TestNGScripts;

import org.testng.annotations.Test;

public class Test1 {
	
  @Test
  public void add() {
	  
	  int a=10, b=100;
	  
	  int c=a+b;
	  System.out.println("Sum is: "+c);
  } 
  
  @Test
	public void sub()
	{
		int a,b,c;
		a=100;
		b=20;
		c=a-b;
		System.out.println("Difference is: "+c);
	}
	
	@Test
	public void multiply()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println("Product is: "+c);
	}
}
