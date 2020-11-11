package TestNGScripts;

import org.testng.annotations.Test;

public class Test2 {
  
	@Test
	public void divide()
	{
		int a,b,c;
		a=500;
		b=10;
		c=a/b;
		System.out.println("Division is: "+c);
	}
	
	@Test
	public void StrMethod()
	{
		String s1 = "Good";
		String s2 = "Morning";
		String s3 = s1 + s2;
		System.out.println("String Method: "+s3);
	}
	  
	  
  }

