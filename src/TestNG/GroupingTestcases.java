package TestNG;

import org.testng.annotations.Test;

public class GroupingTestcases {

	@Test(priority=1,groups= "Buildacceptance")
	public void BuildCheck(){
		
		System.out.println("Build acceptacne test");
	}
	//By using 'priority' keyword we can priorities the test cases(@Test)
	//By using 'groups' keyword we can create the groups
	
	@Test(priority=2,groups= "Buildacceptance")
	public void EnterURL() {
		System.out.println("Enter URL");
	}
	
	@Test(priority=3,groups= "Enter Credentials")
	public void ValidateUserlogin() {
		System.out.println("Validate user login details");
	}
	
	@Test(priority=4,groups= "Enter Credentials")
	public void Enterusername() {
		System.out.println("Enter user name");
	}
	
	@Test(priority=5,groups= "Enter Credentials")
	public void Enterpassword() {
		System.out.println("Enter password");
	}
	
	@Test(priority=6,groups= "SubmitButton")
	public void SubmitStatus() {
		System.out.println("get the xpath of submit button");
	}
	
	@Test(priority=7,groups= "SubmitButton")
	public void Submitbutton() {
		System.out.println("click submit button");
	}
}
