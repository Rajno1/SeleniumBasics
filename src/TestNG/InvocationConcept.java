package TestNG;

import org.testng.annotations.Test;

public class InvocationConcept {
	
	//invocationCount - is a keyword useful to repeat the test cases number of times

	@Test(invocationCount=5)
	public void sum() {
		
		int a = 12;
		int b = 13;
		int c = a+b;
		
		System.out.println("sum of a and b is :" + c);
		
		
	}
	
	 
}
